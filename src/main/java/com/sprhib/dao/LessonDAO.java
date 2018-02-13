package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Lesson;

public interface LessonDAO {
	
	public void addLesson(Lesson Lesson);
	public void updateLesson(Lesson Lesson);
	public Lesson getLesson(Long id);
	public void deleteLesson(Long id);
	public List<Lesson> getLessons();
	public Lesson getLesson(String l);
	

}
