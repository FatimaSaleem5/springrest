package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
//make a list to store data temporarily
	List<Course> list; 
	
	//making constructor of List
	public CourseServiceImpl()
	{
		//obj of constructor 
		list = new ArrayList<>();
		list.add(new Course(145, "java course","Basic of java course"));
		list.add(new Course (123, "Springboot course", "Creating rest api's using sprint boot"));
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for (Course course:list) 
		{
		 if(course.getId()==courseId)
		 {
			 c=course;
			 break;
		 }
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	

}
