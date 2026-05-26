package com.finchtalk.courseapp.service;

import com.finchtalk.courseapp.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public CourseService() {

        courses.add(new Course(
                "React Fundamentals",
                "Frontend Development",
                "Beginner",
                "4 Weeks",
                "Learn React basics and components",
                "Students and frontend beginners"
        ));

        courses.add(new Course(
                "Java Spring Boot Basics",
                "Backend Development",
                "Intermediate",
                "6 Weeks",
                "Learn REST APIs using Spring Boot",
                "Java developers"
        ));

        courses.add(new Course(
                "Python for AI",
                "Artificial Intelligence",
                "Beginner",
                "5 Weeks",
                "Introduction to AI using Python",
                "AI enthusiasts"
        ));

        courses.add(new Course(
                "DevOps with Docker",
                "DevOps",
                "Intermediate",
                "5 Weeks",
                "Learn Docker and DevOps basics",
                "Developers and DevOps beginners"
        ));

        courses.add(new Course(
                "Cloud Fundamentals",
                "Cloud Computing",
                "Beginner",
                "4 Weeks",
                "Introduction to cloud platforms and services",
                "Students and IT learners"
        ));

        courses.add(new Course(
                "Professional Communication",
                "Soft Skills",
                "Beginner",
                "3 Weeks",
                "Improve workplace communication skills",
                "Students and professionals"
        ));

        courses.add(new Course(
                "AI Tools Foundation",
                "Artificial Intelligence",
                "Beginner",
                "4 Weeks",
                "Introduction to modern AI productivity tools",
                "AI learners and beginners"
        ));
    }

    public List<Course> searchCourses(String keyword) {

        List<Course> result = new ArrayList<>();

        for (Course course : courses) {

            if (
                course.getCourseName().toLowerCase().contains(keyword.toLowerCase().trim())
                || course.getCategory().toLowerCase().contains(keyword.toLowerCase().trim())
            ) {

                result.add(course);
            }
        }

        return result;
    }
}