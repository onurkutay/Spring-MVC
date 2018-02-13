package com.sprhib.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.Converter.StudentEditor;
import com.sprhib.model.Lesson;
import com.sprhib.model.Student;
import com.sprhib.service.LessonService;
import com.sprhib.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private LessonService lessonService;

	/// ----------------------------------------AJAX KISMI---------------------------------------------------------------------
//
//	@RequestMapping("/home")
//	public ModelAndView home(ModelMap model) {
//		model.put("students", studentService.findAll());
//		return new ModelAndView("student", model);
//	}

	@RequestMapping(value = "/loadAjax", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("/studentTable");
	}

	@RequestMapping(value = "/load/{firstName}", method = RequestMethod.GET)
	public ModelAndView loadByName(@PathVariable("firstName") String firstName, ModelMap model) {
		model.put("students", studentService.findByFirstName(firstName));
		return new ModelAndView("/searchStudentAjax", model);
	}

	//////////////////////////////////////////////// Çalışan
	//////////////////////////////////////////////// Kısım//////////////////////////////////////////////////////
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addStudentPage() {
		ModelAndView modelAndView = new ModelAndView("add-student-form");
		modelAndView.addObject("student", new Student());
		modelAndView.addObject("lessonss", lessonService.getLessons());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addingStudent(@ModelAttribute Student student, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("home");
		studentService.addStudent(student);
		String message = "Student was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	@ModelAttribute("lessonss")
	public List<Lesson> initializeProfiles() {
		return lessonService.getLessons();
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Lesson.class, new StudentEditor(lessonService.getLessons()));
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfStudents() {
		ModelAndView modelAndView = new ModelAndView("list-of-students");

		List<Student> Students = studentService.getStudents();
		modelAndView.addObject("students", Students);

		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editStudentPage(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("edit-student-form");
		Student Student = studentService.getStudent(id);
		modelAndView.addObject("student", Student);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView edditingStudent(@ModelAttribute Student Student, @PathVariable Long id) {

		ModelAndView modelAndView = new ModelAndView("home");

		studentService.updateStudent(Student);

		String message = "Student was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("home");
		studentService.deleteStudent(id);
		String message = "Student was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView deleteStudentPage() {
		return new ModelAndView("searchStudent");
	}

	@RequestMapping(value = "/search")
	public String Search(@RequestParam("searchString") String i, Model model) {

		if (i != null) {
			Student searchResult = studentService.getStudentWithStudentId(Integer.parseInt(i));
			model.addAttribute("student", searchResult);

		}

		return "edit-student-form";
	}

	@RequestMapping(value = "/deleteStudentFinal", method = RequestMethod.POST)
	public ModelAndView deleteStudentPageWithStuId(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("home");
		studentService.deleteStudentWithStudentId(id);
		String message = "Student was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
