package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public Student getStudent(Long l);
	public void deleteStudent(Long l);
	public List<Student> getStudents();
	public Student getStudentWithStudentId(int i);
	public void deleteStudentWithStudentId(int i);
	public List<Student> findByFirstName(String firstName);
	 List<Student> findAll();
}
