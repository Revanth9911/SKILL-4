package com.fsad.studentdi;

/**
 * Student POJO - used for both XML and Annotation-based DI
 * Supports Constructor Injection and Setter Injection
 */
public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    // ─── Constructor Injection ───────────────────────────────────────────────
    public Student(int studentId, String name, String course, int year) {
        this.studentId = studentId;
        this.name      = name;
        this.course    = course;
        this.year      = year;
    }

    // ─── Setter Injection (course & year) ────────────────────────────────────
    public void setCourse(String course) { this.course = course; }
    public void setYear(int year)        { this.year   = year;   }

    // ─── Getters ─────────────────────────────────────────────────────────────
    public int    getStudentId() { return studentId; }
    public String getName()      { return name;      }
    public String getCourse()    { return course;    }
    public int    getYear()      { return year;      }

    @Override
    public String toString() {
        return "┌─────────────────────────────────────┐\n" +
               "│         Student Information          │\n" +
               "├─────────────────────────────────────┤\n" +
               "│ Student ID : " + studentId + "\n" +
               "│ Name       : " + name      + "\n" +
               "│ Course     : " + course    + "\n" +
               "│ Year       : " + year      + "\n" +
               "└─────────────────────────────────────┘";
    }
}
