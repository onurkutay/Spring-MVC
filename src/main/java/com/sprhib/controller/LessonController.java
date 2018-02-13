package com.sprhib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.model.Lesson;
import com.sprhib.service.LessonService;

@Controller
@RequestMapping(value = "/lesson")
public class LessonController {

	@Autowired
	private LessonService LessonService;

	@RequestMapping(value = "/addLesson", method = RequestMethod.GET)
	public ModelAndView addLessonPage() {
		ModelAndView modelAndView = new ModelAndView("addLesson");
		modelAndView.addObject("lesson", new Lesson());
		return modelAndView;
	}

	@RequestMapping(value = "/addLesson", method = RequestMethod.POST)
	public ModelAndView addingLesson(@ModelAttribute Lesson lesson) {

		ModelAndView modelAndView = new ModelAndView("home");
		LessonService.addLesson(lesson);

		String message = "Lesson was successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/listLesson")
	public ModelAndView listOfLessons() {
		ModelAndView modelAndView = new ModelAndView("list-of-lessons");

		List<Lesson> Lessons = LessonService.getLessons();
		modelAndView.addObject("lessons", Lessons);

		return modelAndView;
	}

	@RequestMapping(value = "/editLesson/{id}", method = RequestMethod.GET)
	public ModelAndView editLessonPage(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("edit-lesson-form");
		Lesson Lesson = LessonService.getLesson(id);
		modelAndView.addObject("lesson", Lesson);
		return modelAndView;
	}

	@RequestMapping(value = "/editLesson/{id}", method = RequestMethod.POST)
	public ModelAndView edditingLesson(@ModelAttribute Lesson Lesson, @PathVariable Long id) {

		ModelAndView modelAndView = new ModelAndView("home");

		LessonService.updateLesson(Lesson);

		String message = "Lesson was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/deleteLesson/{id}", method = RequestMethod.GET)
	public ModelAndView deleteLesson(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("home");
		LessonService.deleteLesson(id);
		String message = "Lesson was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	@RequestMapping(value = "/deleteLesson", method = RequestMethod.GET)
	public ModelAndView deleteLessonPage() {
		ModelAndView modelAndView = new ModelAndView("findDeleteLesson");
		modelAndView.addObject("lesson", new Lesson());
		return modelAndView;
	}
	

}
