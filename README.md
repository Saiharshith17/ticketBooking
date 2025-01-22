# Ticket Booking Application  

## Project Description  
The Ticket Booking Application is a Java-based system designed for managing train schedules, user registrations, and ticket bookings. It uses a modular architecture to ensure maintainability and scalability. The application incorporates both JSON files for lightweight local data storage and SQL for persistent database operations.  

## Features  
- User Registration and Management  
- Train Scheduling and Availability Management  
- Ticket Booking and Cancellation  
- Local JSON database for quick operations  
- SQL database integration for persistent data storage  
- Unit tests to ensure reliability and correctness  

## Project Structure  
```plaintext
saiharshith17-ticketbooking/
├── gradle.properties
├── gradlew
├── gradlew.bat
├── app/
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── ticket/
│       │           └── booking/
│       │               ├── App.java
│       │               ├── entities/
│       │               │   ├── Ticket.java
│       │               │   ├── Train.java
│       │               │   └── User.java
│       │               ├── localDb/
│       │               │   ├── trains.json
│       │               │   └── users.json
│       │               ├── service/
│       │               │   ├── TrainService.java
│       │               │   └── UserBookingService.java
│       │               └── util/
│       │                   └── UserServiceUtil.java
│       └── test/
│           └── java/
│               └── org/
│                   └── example/
│                       └── AppTest.java
└── gradle/
    ├── libs.versions.toml
    └── wrapper/
        └── gradle-wrapper.properties
