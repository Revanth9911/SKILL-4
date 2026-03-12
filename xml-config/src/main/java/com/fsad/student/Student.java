package com.fsad.student;

public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    // Constructor Injection
    public Student(int studentId, String name, String course, int year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Setter Injection for course
    public void setCourse(String course) {
        this.course = course;
    }

    // Setter Injection for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getName()   { return name; }
    public String getCourse() { return course; }
    public int getYear()      { return year; }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
               ", name=" + name +
               ", course=" + course +
               ", year=" + year + "]";
    }
}
