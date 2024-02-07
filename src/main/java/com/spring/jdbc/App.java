package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.mavenapp.springjdbc.dao.Studentdao;

public class App {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
	        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
	           
	        Studentdao studentDao = context.getBean("studentDao",Studentdao.class);
	        
	        //insert values
	        Student student =new Student();
	        student.setId(11);
	        student.setName("Purvi");
	        student.setCity("Puttur");
	        int result = studentDao.insert(student);
	        System.out.println("student added "+result);
	        
	        //update values
//	        Student student1=new Student();
//	        student.setId(3);
//	        student.setName("bhuvi12");
//	        student.setCity("drak");
//	      int result1 = studentDao.change(student);
//	      System.out.println("student updated "+result1);

	      
	      //delete values
	      int result2 = studentDao.delete(5);
	     System.out.println("student deleted "+result2);
	//
//	        
	     Student student1 = studentDao.getstudent(2);
	     System.out.println(student1);
	}
	}
