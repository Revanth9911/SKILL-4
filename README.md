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
```

---

## How to Run

### Prerequisites
- Java 17+
- Maven 3.6+

### Build
```bash
mvn clean compile
```

### Run – XML Configuration (Task 4a)
```bash
mvn exec:java -Dexec.mainClass="com.fsad.studentdi.xml.MainXML"
```

### Run – Annotation Configuration (Task 4b)
```bash
mvn exec:java -Dexec.mainClass="com.fsad.studentdi.annotation.MainAnnotation"
```

---

## Expected Output

### XML-Based DI
```
=== XML-Based Dependency Injection ===

[ Constructor Injection ]
┌─────────────────────────────────────┐
│         Student Information          │
├─────────────────────────────────────┤
│ Student ID : 1001
│ Name       : Arjun Sharma
│ Course     : B.Tech CSE
│ Year       : 2
└─────────────────────────────────────┘

[ Setter Injection ]
┌─────────────────────────────────────┐
│         Student Information          │
├─────────────────────────────────────┤
│ Student ID : 1002
│ Name       : Priya Nair
│ Course     : M.Tech AI&DS
│ Year       : 1
└─────────────────────────────────────┘
```

### Annotation-Based DI
```
=== Annotation-Based Dependency Injection ===

[ Constructor Injection ]
...Student ID: 1003, Name: Ravi Kumar, Course: B.Tech CS&IT, Year: 3...

[ Setter Injection ]
...Student ID: 1004, Name: Divya Reddy, Course: B.Tech AI&DS, Year: 4...
```

---

## Push to GitHub

```bash
# Step 1 – Initialise git inside the project folder
git init
git add .
git commit -m "FSAD Skill-4: Spring DI – Constructor & Setter Injection (XML + Annotation)"

# Step 2 – Create a new repo on GitHub (via browser or gh CLI), then:
git remote add origin https://github.com/<your-username>/spring-di-project.git
git branch -M main
git push -u origin main
```

---

## Viva Questions & Answers

**Q1. What is Dependency Injection (DI) in Spring?**  
DI is a design pattern where an object's dependencies are provided by an external entity (the Spring IoC container) rather than the object creating them itself. This promotes loose coupling and easier testing.

**Q2. What is the difference between Constructor DI and Setter DI?**  
| | Constructor DI | Setter DI |
|---|---|---|
| How | Values passed via constructor | Values assigned via setter methods |
| When | At object creation | After object creation |
| Mandatory fields | Enforced (required args) | Optional by nature |
| Immutability | Supports immutable objects | Objects can be reconfigured |

**Q3. What is the purpose of the IoC container?**  
The IoC (Inversion of Control) container manages the lifecycle and configuration of application objects (beans). It instantiates, wires, configures, and assembles beans. `ApplicationContext` is the main IoC container interface in Spring.

**Q4. Why is DI preferred over manual object creation?**  
- Reduces tight coupling between classes  
- Easier unit testing (dependencies can be mocked)  
- Configuration is centralised (XML / annotations)  
- Promotes the Single Responsibility Principle  

**Q5. Can Constructor Injection and Setter Injection be used together?**  
Yes. A common pattern is to inject mandatory dependencies via the constructor and optional dependencies via setters. This project demonstrates exactly that — `studentId` and `name` are constructor-injected while `course` and `year` can be overridden via setters.
