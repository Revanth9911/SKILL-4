package com.fsad.studentdi.annotation;

import com.fsad.studentdi.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TASK 4b – Annotation Configuration
 * Loads the Spring IoC container using AppConfig.class
 * and retrieves both Student beans (constructor & setter injected).
 */
public class MainAnnotation {

    public static void main(String[] args) {

        System.out.println("=== Annotation-Based Dependency Injection ===\n");

        // Load the Spring IoC container from Java config class
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // ── Constructor Injection bean ──────────────────────────────────────
        System.out.println("[ Constructor Injection ]");
        Student studentConstructor = context.getBean("studentConstructor", Student.class);
        System.out.println(studentConstructor);

        // ── Setter Injection bean ───────────────────────────────────────────
        System.out.println("\n[ Setter Injection ]");
        Student studentSetter = context.getBean("studentSetter", Student.class);
        System.out.println(studentSetter);

        // Close context
        ((AnnotationConfigApplicationContext) context).close();
    }
}
