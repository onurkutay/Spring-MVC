package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Lesson;

@Repository
public class LessonDAOImpl implements LessonDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addLesson(Lesson Lesson) {
		getCurrentSession().save(Lesson);
	}

	@Override
	public void updateLesson(Lesson Lesson) {
		Lesson LessonToUpdate = getLesson(Lesson.getId());
		LessonToUpdate.setName(Lesson.getName());
		getCurrentSession().update(LessonToUpdate);

	}

	@Override
	public Lesson getLesson(Long id) {
		Lesson Lesson = (Lesson) getCurrentSession().get(Lesson.class, id);
		return Lesson;
	}

	@Override
	public void deleteLesson(Long id) {
		Lesson Lesson = getLesson(id);
		if (Lesson != null)
			getCurrentSession().delete(Lesson);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lesson> getLessons() {
		 List<Lesson> abc= getCurrentSession().createQuery("from Lesson").list();
		 return abc;
	}

	@Override
	public Lesson getLesson(String l) {
		Lesson Lesson = (Lesson) getCurrentSession().get(Lesson.class, l);
		return Lesson;
	}

	

}
