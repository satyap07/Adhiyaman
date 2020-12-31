package com.example.adhiyaman;

import java.util.ArrayList;

public class Course {

    private int PhotoId;
    private String CourseName;
    private String CourseContent;


    public Course(int photoId, String courseName, String courseContent) {
        PhotoId = photoId;
        CourseName = courseName;
        CourseContent = courseContent;
    }

    public int getPhotoId() {
        return PhotoId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getCourseContent() {
        return CourseContent;
    }
}
