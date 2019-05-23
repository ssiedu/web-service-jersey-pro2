package com.ssi.firstws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("course")
public class CourseResource {

	private CourseDAO dao;
	
	public CourseResource(){
		dao=new CourseDAO();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("json")
	public List<Course> getAllCoursesAsJSON(){
		List<Course> courses=dao.getAllCourses();
		return courses;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("xml")
	public List<Course> getAllCoursesAsXML(){
		List<Course> courses=dao.getAllCourses();
		return courses;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("json/{id}")
	public Course getCourseAsJSON(@PathParam("id") int code){
		Course course=dao.searchCourseById(code);
		return course;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("xml/{id}")
	public Course getCourseAsXML(@PathParam("id") int code){
		Course course=dao.searchCourseById(code);
		return course;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{id}")
	public String getCourse(@PathParam("id") int code){
		Course course=dao.searchCourseById(code);
		String result=course.toString();
		return result;
	}
	
}
