package com.sprhib.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "student", schema = "onur")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "rating")
	private Integer rating;

	@Column(name = "student_id")
	private int studentId;

	@Column(name = "school")
	private String school;
//	, fetch = FetchType.LAZY
	@NotEmpty
	@ManyToMany(targetEntity = Lesson.class,fetch = FetchType.EAGER)
	@JoinTable(name = "student_lesson", schema = "onur", joinColumns = {
			@JoinColumn(name = "student_id") }, inverseJoinColumns = { @JoinColumn(name = "lesson_id") })
	private List<Lesson> lessons = new ArrayList<Lesson>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString()
	{
		return getName()+"  "+ getSchool() + "  " +getStudentId() + " ";
	}
}
