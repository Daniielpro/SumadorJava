 
# Number Adder in Java

This project is a simple Spring Boot application that adds two numbers together. The application provides a web interface where users can enter two numbers and get the sum.

## Requirements

- Java JDK 11 or higher
- Maven
- Docker (optional, to create a Docker image)

## Clone Repository

To clone this repository, open a terminal and run the following command:

``bash
git clone https://github.com/Daniielpro/SumadorJava.git

 
## Local Execution

To run the project locally, follow these steps:

1. Open terminal from the root folder of the project. 

2. We build the program with the following command to generate our .jar of our application and to be able to execute it 

  ``bash
  mvn clean package 

3. Once our application is built, we execute it with the following command

   ```bash
   java -jar target/Sumador-0.0.1-SNAPSHOT.jar 

4. Open the terminal: http://localhost:8080

## Dcoker execution

To run the project using Docker, follow these steps:
Open terminal from the root folder of the project

1. Execute the following command

   ````bash
   docker build -t username/appname .

2. Run the following command

   ````bash
   docker run -d -p 8080:8080 username/nameapp



