package com.finchtalk.courseapp.model;

public class Course {

    private String courseName;
    private String category;
    private String level;
    private String duration;
    private String description;
    private String recommendedFor;

    public Course(String courseName, String category, String level,
                  String duration, String description, String recommendedFor) {
        this.courseName = courseName;
        this.category = category;
        this.level = level;
        this.duration = duration;
        this.description = description;
        this.recommendedFor = recommendedFor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public String getRecommendedFor() {
        return recommendedFor;
    }
}