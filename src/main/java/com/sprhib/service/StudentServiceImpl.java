package com.sprhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.StudentDAO;
import com.sprhib.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public void addStudent(Student student) {
		studentDAO.addStudent(student);		
	}

	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
	}

	@Override
	public Student getStudent(Long id) {
		return studentDAO.getStudent(id);
	}

	@Override
	public void deleteStudent(Long id) {
		studentDAO.deleteStudent(id);
	}

	@Override
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	public Student getStudentWithStudentId(int i) {
		return studentDAO.getStudentWithStudentId(i);
		
	}

	@Override
	public void deleteStudentWithStudentId(int i) {
		studentDAO.deleteStudentWithStudentID(i);
		
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		return studentDAO.findByFirstName(firstName);
		
	}

	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	


}
