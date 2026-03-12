# FSAD Skill-4 – Spring Dependency Injection
**Course:** 24SDCS02 / 24SDCS02E / 24SDCS02P / 24SDCS02L  
**Topic:** Constructor Injection & Setter Injection (XML + Annotation)

---

## Project Structure

```
spring-di-project/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/fsad/studentdi/
        │       ├── Student.java                    ← POJO (shared)
        │       ├── xml/
        │       │   └── MainXML.java                ← Task 4a main class
        │       └── annotation/
        │           ├── AppConfig.java              ← Task 4b @Configuration
        │           └── MainAnnotation.java         ← Task 4b main class
        └── resources/
            └── applicationContext.xml              ← XML bean definitions

## Expected Output


```
=== XML-Based Dependency Injection ===

[ Constructor Injection ]
┌─────────────────────────────────────┐
│         Student Information          │
├─────────────────────────────────────┤
│ Student ID : 30781
│ Name       : Ch.Revanth Srivas
│ Course     : B.Tech CSE-1
│ Year       : 2
└─────────────────────────────────────┘

[ Setter Injection ]
┌─────────────────────────────────────┐
│         Student Information          │
├─────────────────────────────────────┤
│ Student ID : 30479
│ Name       : S.Megha Priyanshu
│ Course     : B.Tech AI&DS
│ Year       : 1
└─────────────────────────────────────┘
```

