package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Contact;
import com.sprhib.model.Lesson;
import com.sprhib.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Student> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Contact.class).list();
	}

	@Override
	public void addStudent(Student Student) {
		getCurrentSession().save(Student);
	}

	@Override
	public void updateStudent(Student student) {

		Student StudentToUpdate = getStudent(student.getId());
		StudentToUpdate.setName(student.getName());
		StudentToUpdate.setRating(student.getRating());
		StudentToUpdate.setSchool(student.getSchool());
		StudentToUpdate.setStudentId(student.getStudentId());
		if (!matching(StudentToUpdate.getLessons(), student.getLessons().get(0))) {
			StudentToUpdate.getLessons().add(student.getLessons().get(0));

		}
		getCurrentSession().update(StudentToUpdate);

	}

	private boolean matching(List<Lesson> list, Lesson lesson) {
		int i = 0;
		while (i < list.size()) {
			if (list.get(i).equals(lesson)) {
				return true;
			}
			i++;
		}
		return false;
	}

	@Override
	public Student getStudent(long id) {
		Student Student = (Student) getCurrentSession().get(Student.class, id);
		return Student;
	}

	@Override
	public void deleteStudent(long id) {
		Student Student = getStudent(id);
		if (Student != null)
			getCurrentSession().delete(Student);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents() {
		return getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public Student getStudentWithStudentId(int id) {

		Student student = (Student) getCurrentSession().createCriteria(Student.class)
				.add(Restrictions.eq("studentId", id)).list().get(0);

		return student;
	}

	@Override
	public void deleteStudentWithStudentID(int i) {
		Student Student = getStudentWithStudentId(i);
		if (Student != null)
			getCurrentSession().delete(Student);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findByFirstName(String firstName) {
		return sessionFactory.getCurrentSession().createCriteria(Student.class)
				.add(Restrictions.like( "name","%"+ firstName + "%").ignoreCase()).list();

	}

}
