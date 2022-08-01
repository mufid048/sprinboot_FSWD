package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/listCourse")
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }

    @GetMapping("/Course/{id}")
    public Course getCourse(@PathVariable Integer id){
        return courseRepository.findById(id).get();
    }

    @DeleteMapping("/Course/{id}")
    public List<Course> deleteCourse(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

    @PostMapping("/Course")
    public List<Course> addCourse(@RequestBody Course course) {
        courseRepository.save(course);
        return courseRepository.findAll();
    }

    @PutMapping("/Course/{id}")
    public List<Course> updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        Course courseObj = courseRepository.findById(id).get();
        courseObj.setTitle(course.getTitle());
        courseObj.setDescription(course.getDescription());
        Object CourseObj;
        courseRepository.save(courseObj);
        return courseRepository.findAll();
    }

}
