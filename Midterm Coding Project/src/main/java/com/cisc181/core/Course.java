package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}
	public Course(String courseName, int gradePoints) {
		this.CourseID = UUID.randomUUID();
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
	}
	
	
	

}
