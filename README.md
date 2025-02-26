# CS-320-Module-Eight-Journal
CS 320 Module Eight Journal

Project Contributions

This repository contains my contributions to the CS 320 Software Test, Automation portfolio submission. The artifacts included demonstrate my ability to write and implement unit tests, apply software testing strategies, and ensure high-quality, maintainable code.

Reflections on Software Testing and Development

1. How can I ensure that my code, program, or software is functional and secure?

Ensuring software functionality and security requires a combination of systematic testing, defensive programming, and security best practices. I incorporated JUnit testing to validate business logic, enforce constraints, and handle edge cases effectively.

Security-wise, rigorous input validation and exception handling prevent vulnerabilities such as SQL injection, buffer overflows, and data corruption. Additionally, I applied boundary testing and exception testing to ensure that invalid inputs were properly handled without compromising the integrity of the system.

2. How do I interpret user needs and incorporate them into a program?

Interpreting user needs involves understanding the software requirements and translating them into functional, testable components. By analyzing business rules and constraints, I ensured that core functionalities like contact management, task scheduling, and appointment validation met user expectations.

For example, user needs required that:

Phone numbers must be exactly 10 digits → Implemented input validation in Contact.java.

Appointments must not be scheduled in the past → Validated appointment date in Appointment.java.

Contact names must be no longer than 10 characters → Enforced constraints in ContactService.java.

Using test-driven development (TDD), I refined my code iteratively based on test results, ensuring that all requirements were fulfilled correctly.

3. How do I approach designing software?

My approach to software design follows a structured methodology:

Requirements Analysis: Understanding functional needs and constraints.

Modular Design: Breaking the application into reusable components (Contact, Task, Appointment).

Unit Testing and Validation: Implementing JUnit tests to verify correctness and robustness.

Efficiency and Maintainability: Optimizing code with reusable methods, avoiding redundant logic, and leveraging object-oriented principles.

By following these principles, I ensured that my code was scalable, maintainable, and easily testable, making future enhancements seamless while maintaining high quality.

Conclusion

This portfolio submission showcases my skills in software testing, automation, and quality assurance. Through structured testing methodologies and disciplined software development practices, I have ensured that my code is functional, secure, and aligned with user requirements. Moving forward, I will continue applying these principles to build robust, efficient, and maintainable software solutions.
