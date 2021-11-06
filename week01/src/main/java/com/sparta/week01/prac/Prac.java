package com.sparta.week01.prac;

public class Prac {
    public static void main(String[] args) {
        Course course = new Course("Java","none", 30);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        String title = "Spring";
        String tutor = "nam byeong kwan";

        course.setTitle(title);
        course.setTutor(tutor);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
    }
}
