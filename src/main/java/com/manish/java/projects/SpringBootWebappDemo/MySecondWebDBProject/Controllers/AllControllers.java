package com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Dao.StudentDao;
import com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Model.Student;

//@Controller
@RestController
public class AllControllers 
{
	
	@Autowired
	StudentDao studentdao ; 
	
//	@RequestMapping("/")
//	public String home()
//	{
//		return "Home.jsp" ; 
//	}
//	
//	@RequestMapping("home")
//	public String home1()
//	{
//		return "getStudent.jsp" ; 
//	}

	
	@PostMapping(path="/Student",consumes={"application/json"})
	public Student addStudent(@RequestBody Student student)
	{

		System.out.println(student.toString());	
		
		studentdao.save(student);
		
		return student ;
		
	
	}
	
//	@RequestMapping(path="/students",produces= {"application/xml"})
	@GetMapping(path="/Students",produces= {"application/xml"})
	@ResponseBody
	public List<Student> fetchStudents()
	{
		return studentdao.findAll() ; 
		
	}
	
	@GetMapping("/Student/{sid}")
//	@ResponseBody
	public Optional<Student> fetchStudent(@PathVariable("sid") int aid)
	{
		return studentdao.findById(aid); 
		
	}
	
	
	@DeleteMapping("/Student/{sid}")
	public String deleteStudent(@PathVariable ("sid") int aid)
	{	
		Student s = studentdao.getOne(aid) ;
		
		studentdao.delete(s); 
		
//		studentdao.deleteById(aid);
		return "Delete Sucessfull... "  ; 
	}
	
	
	
}
