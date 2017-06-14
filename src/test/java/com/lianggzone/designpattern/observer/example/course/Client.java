package com.lianggzone.designpattern.observer.example.course;

public class Client {
    public static void main(String[] args) {
        Course course = new Course();

        Observer observer = new CourseObserver();
        course.addObserver(observer);

        course.addCourse();
        course.updateCourse();
        course.removeCourse();
    }
}
