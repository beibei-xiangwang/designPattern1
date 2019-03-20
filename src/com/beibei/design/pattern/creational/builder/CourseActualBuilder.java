package com.beibei.design.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();


    @Override
    public CourseActualBuilder buildCourseName(String courseName) {
        course.setCourseName(courseName);
        return this;
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}