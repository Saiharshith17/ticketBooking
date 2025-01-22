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
```

Technologies Used
Programming Language: Java
Build Tool: Gradle
Database: SQL (persistent storage), JSON (local storage)
Testing Framework: JUnit
Version Control: Git
IDE: IntelliJ IDEA / Eclipse
Prerequisites
Java 17 or higher installed
Gradle installed
SQL database setup (MySQL/PostgreSQL)
Git for version control
Installation
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/saiharshith17-ticketbooking.git
cd saiharshith17-ticketbooking
Build the project:
bash
Copy code
./gradlew build
Configure the SQL database by updating the database connection details in the App.java file or a properties file.
Running the Application
Run the main application:

bash
Copy code
./gradlew run
Testing
Run the unit tests:

bash
Copy code
./gradlew test
Contributing
Fork the repository.
Create a new feature branch:
bash
Copy code
git checkout -b feature-name
Commit your changes:
bash
Copy code
git commit -m "Add your message here"
Push the branch to your forked repository:
bash
Copy code
git push origin feature-name
Create a pull request.
License
This project is licensed under the MIT License.

Author
Saiharshith







