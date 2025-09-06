# Exercise: Java Maven Random Names Generator with Dual Input & Fat JAR

---

## Description

Create a Java 8 Maven project that prints a specified number of random full names to the console.

Your program must:

- Use the **Java Faker** library to generate random full names.
- Accept **two possible inputs** for how many names to print:
    1. A system property named `parameters.count` passed with the `-D` JVM argument.
    2. A command-line argument (first argument).
- Determine the **number of names to print** by choosing the **smaller positive integer** among the system property and command-line argument inputs.
- Use a **default value of 5** if neither input is provided or both are invalid.
- Package the project as a **runnable fat JAR** using the **Maven Shade Plugin**.
- The fat JAR should have the `Main-Class` set correctly to run the program with `java -jar`.

---

## Requirements

1. Set up a Maven project using Java 8.
2. Add the Java Faker dependency.
3. Implement the logic to read the inputs (`parameters.count` system property and first command-line argument).
4. Select the smallest valid positive number from the inputs or use the default.
5. Generate and print that many random full names.
6. Configure the Maven Shade Plugin for a runnable fat JAR.
7. Provide instructions for building and running the JAR with different inputs.

---

## Testing the Application

Assuming you built your project and created the fat JAR at:

## Testing the Application

Assuming you built your project and created the fat JAR at:

    target/random-names-1.0-SNAPSHOT.jar

Test the application with the following commands:

- **Run with no input (prints default 5 names):**

        java -jar target/random-names-1.0-SNAPSHOT.jar

- **Run specifying count with system property only:**

        java -Dparameters.count=8 -jar target/random-names-1.0-SNAPSHOT.jar

- **Run specifying count with command-line argument only:**

        java -jar target/random-names-1.0-SNAPSHOT.jar 10

- **Run specifying both system property and command-line argument (prints smaller):**

        java -Dparameters.count=8 -jar target/random-names-1.0-SNAPSHOT.jar 10

- **Run specifying invalid inputs (non-positive integers or non-numbers) to verify default is used:**

        java -Dparameters.count=-5 -jar target/random-names-1.0-SNAPSHOT.jar abc

---

### Notes:

- Make sure to handle invalid or missing inputs gracefully.
- The output should be one random full name per line.
