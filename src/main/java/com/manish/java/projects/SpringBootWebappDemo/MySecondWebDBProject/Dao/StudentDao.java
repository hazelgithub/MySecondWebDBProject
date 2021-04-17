package com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject.Model.Student;

public interface StudentDao extends JpaRepository<Student, Integer>
{

}
