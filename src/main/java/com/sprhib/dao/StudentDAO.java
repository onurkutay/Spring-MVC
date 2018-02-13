package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Student;

public interface StudentDAO {
	
	public void addStudent(Student Student);
	public void updateStudent(Student Student);
	public Student getStudent(long id);
	public void deleteStudent(long id);
	public List<Student> getStudents();
	public Student getStudentWithStudentId(int id);
	public void deleteStudentWithStudentID(int i);
	public List<Student> findByFirstName(String firstName);
	List<Student> findAll();

}
