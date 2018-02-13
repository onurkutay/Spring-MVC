package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Lesson;

public interface LessonService {
	
	public void addLesson(Lesson lesson);
	public void updateLesson(Lesson lesson);
	public Lesson getLesson(Long l);
	public Lesson getLesson(String l);
	public void deleteLesson(Long l);
	public List<Lesson> getLessons();
	
}
