package com.fsad.studentdi.annotation;

import com.fsad.studentdi.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TASK 4b – Java Annotation Configuration
 *
 * @Configuration  → marks this class as a Spring configuration source
 * @Bean           → each method registers a bean in the IoC container
 *
 * Demonstrates both Constructor Injection and Setter Injection
 * without any XML file.
 */
@Configuration
public class AppConfig {

    // ── Constructor Injection bean ──────────────────────────────────────────
    @Bean
    public Student studentConstructor() {
        // All values supplied through the constructor
        return new Student(30781, "Ch.Revanth Sivas", "B.Tech CSE 1", 3);
    }

    // ── Setter Injection bean ───────────────────────────────────────────────
    @Bean
    public Student studentSetter() {
        // Create with constructor (required fields)
        Student student = new Student(30479, "Megha", "B.Tech CSE 1", 0);

        // Override course and year via setter injection
        student.setCourse("B.Tech AI&DS");
        student.setYear(4);

        return student;
    }
}
