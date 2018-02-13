package com.sprhib.Converter;

import java.beans.PropertyEditorSupport;
import java.util.List;

import com.sprhib.model.Lesson;

public class StudentEditor extends PropertyEditorSupport {
	private List<Lesson> lessons;

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	public StudentEditor(List<Lesson> lessons) {
		setLessons(lessons);
	}

	@Override
	public void setAsText(String id) {
		Lesson d;
		int i = 0;
		while (Integer.parseInt(id) != lessons.get(i).getId()) {
			i++;
		}
		d = lessons.get(i);

		this.setValue(d);
	}

}
