package com.fsad.studentdi.xml;

import com.fsad.studentdi.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TASK 4a – XML Configuration
 * Loads the Spring IoC container using applicationContext.xml
 * and retrieves the Student bean (both constructor & setter injected).
 */
public class MainXML {

    public static void main(String[] args) {

        System.out.println("=== XML-Based Dependency Injection ===\n");

        // Load the Spring IoC container from XML
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // ── Constructor Injection bean ──────────────────────────────────────
        System.out.println("[ Constructor Injection ]");
        Student studentConstructor = (Student) context.getBean("studentConstructor");
        System.out.println(studentConstructor);

        // ── Setter Injection bean ───────────────────────────────────────────
        System.out.println("\n[ Setter Injection ]");
        Student studentSetter = (Student) context.getBean("studentSetter");
        System.out.println(studentSetter);

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
