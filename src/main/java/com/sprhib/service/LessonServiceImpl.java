package com.sprhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.LessonDAO;
import com.sprhib.model.Lesson;

@Service
@Transactional
public class LessonServiceImpl implements LessonService {
	
	@Autowired
	private LessonDAO lessonDAO;

	@Override
	public void addLesson(Lesson lesson) {
		lessonDAO.addLesson(lesson);		
	}

	@Override
	public void updateLesson(Lesson lesson) {
		lessonDAO.updateLesson(lesson);
	}

	@Override
	public Lesson getLesson(Long id) {
		return lessonDAO.getLesson(id);
	}

	@Override
	public void deleteLesson(Long id) {
		lessonDAO.deleteLesson(id);
	}

	@Override
	public List<Lesson> getLessons() {
		List<Lesson> retList = lessonDAO.getLessons();
		return retList;
	}

	@Override
	public Lesson getLesson(String l) {
		return lessonDAO.getLesson(l);
		
	}

	

	


}
