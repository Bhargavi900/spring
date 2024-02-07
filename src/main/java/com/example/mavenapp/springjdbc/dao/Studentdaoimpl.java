package com.example.mavenapp.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.Student;

public class Studentdaoimpl implements Studentdao{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// insert implementation
	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	// update implementation
	public int change(Student student) {
		// update query
		String query = "update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	// delete implementation
	public int delete(int studentId) {
		// delete query
		String query = "delete from student where Id=? ";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public Student getstudent(int studentId) {
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = (RowMapper<Student>) new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
		}
		


