package com.finchtalk.courseapp.controller;

import org.springframework.web.bind.annotation.*;

import com.finchtalk.courseapp.model.Course;
import com.finchtalk.courseapp.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/search")
    public List<Course> searchCourses(
            @RequestParam String keyword) {

        return courseService.searchCourses(keyword);
    }
}
