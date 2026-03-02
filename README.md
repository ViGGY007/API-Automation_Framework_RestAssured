# API Automation Framework - Rest Assured + TestNG

## Overview
This is a modular and scalable API automation framework built using:

- Java 17
- Rest Assured
- TestNG
- Maven
- Hamcrest Assertions
- Config-driven execution
- Layered architecture design

---

## Architecture

- BaseTest → Test lifecycle management using TestNG
- UserClient → API client abstraction layer
- ConfigReader → Environment configuration management
- Client Layer → Encapsulates API request logic
- Test Layer → Contains validation and assertions only
- Utils → Reusable helper components

---

## Features

- Clean separation between framework and test layer
- Reusable API client abstraction
- Config-driven base URI management
- Structured Maven project layout
- Response validation with Hamcrest
- Scalable architecture for enterprise expansion

---

## How to Run

1. Clone repository
2. Navigate to project root
3. Run `mvn clean test`
4. Or run individual TestNG tests from IntelliJ

---

## Configuration

Configuration is maintained in:

- `src/test/resources/config.properties`

Example:
```
base.url=https://reqres.in/api
```

The framework dynamically reads configuration values using `ConfigReader`.

---

## Reports & Output

- Test execution results → Maven console output
- Response logs → Printed via Rest Assured logging

---

## Future Enhancements

- RequestSpecification Builder pattern
- Authentication handling (Bearer / OAuth)
- Environment switching (dev/qa/prod)
- Logging framework integration
- Reporting (Allure / Extent Reports)
- CI integration (GitHub Actions)
- POJO serialization & deserialization
- Retry mechanism for flaky tests