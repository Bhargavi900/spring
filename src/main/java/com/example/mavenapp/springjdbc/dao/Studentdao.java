package com.example.mavenapp.springjdbc.dao;

import com.spring.jdbc.Student;

public interface Studentdao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
public Student getstudent(int studentId);
}
