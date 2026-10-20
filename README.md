# LLD Interview Mastery — 45 Days

A practical, Java-based course to prepare for Low-Level Design (LLD) interviews.

## Goal

Learn to design maintainable object-oriented systems, implement them in Java, test important behavior, and explain design decisions confidently during interviews.

## Course Roadmap

| Phase | Days | Topics |
|---|---:|---|
| Foundation | 1–7 | LLD approach, OOP, relationships, interfaces, SOLID, design smells, UML |
| Creational Patterns | 8–10 | Factory, Builder, Prototype, Singleton |
| Structural Patterns | 11–14 | Adapter, Facade, Decorator, Proxy, Composite, Bridge, Flyweight |
| Behavioral Patterns | 15–20 | Strategy, Observer, State, Command, Memento, and others |
| Core Interview Problems | 21–30 | Parking Lot, Elevator, ATM, Chess, Splitwise, Booking, Logger, Notification |
| Infrastructure LLD | 31–36 | Cache, Rate Limiter, Scheduler, Hit Counter, File System |
| Production LLD | 37–40 | Persistence, database consistency, idempotency, concurrency |
| Large Systems | 41–43 | Ride Sharing, Food Delivery, Chat |
| Mock Interviews | 44–45 | Senior-level design practice and revision |

## Technology

- Java 21
- Maven
- JUnit 5

## Project Structure

- `01-foundation/` — Foundation lessons
- `02-creational-patterns/` — Creational patterns
- `03-structural-patterns/` — Structural patterns
- `04-behavioral-patterns/` — Behavioral patterns
- `05-core-problems/` — Core interview problems
- `06-infrastructure-lld/` — Infrastructure design problems
- `07-production-lld/` — Production design topics
- `08-large-systems/` — Larger real-world systems
- `09-mock-interviews/` — Mock interview exercises
- `src/main/java/` — Java implementation
- `src/test/java/` — JUnit tests
- `docs/` — Reference notes and revision material

## Daily Workflow

1. Study the day's HTML lesson.
2. Understand the design and responsibilities of each class.
3. Implement or review the Java code.
4. Run the tests.
5. Complete the practice questions.
6. Commit the completed day's work.

## Run Tests

From the project root, run:

```bash
mvn test
```

## Learning Principle

Focus on understanding requirements, assigning responsibilities, choosing appropriate relationships, writing testable code, and explaining trade-offs. Use design patterns only when they solve a real problem.
