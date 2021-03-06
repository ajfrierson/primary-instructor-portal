package com.in28minutes.fullstack.sprintboot.maven.crud.springbootfullstackcrudfullstackwithmaven.controllers;

import com.in28minutes.fullstack.sprintboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course.Course;
import com.in28minutes.fullstack.sprintboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course.CoursesHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseResource {

    @Autowired
    private CoursesHardcodedService courseManagementService;

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username){
        return courseManagementService.findAll();
    }
}
