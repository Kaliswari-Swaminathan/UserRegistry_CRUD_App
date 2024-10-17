# User Registry CRUD Application
This is a simple Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing User entities, with fields username, password, and active. The application uses an H2 in-memory database and Hibernate for JPA.

## Features
* Create a User: Add a new user to the database.
* Read Users: Retrieve a list of all users or a specific user by ID.
* Update a User: Modify existing user details.
* Delete a User: Remove a user from the database.

## Requirements
* Java 17 or above
* Maven 3.6+
* Any IDE that supports Spring Boot (IntelliJ IDEA, Eclipse, etc.)
* Chrome or any browser (to access the H2 console if needed)
## API Endpoints
+ GET /api/users - Retrieve all users
+ GET /api/users/{id} - Retrieve a user by ID
+ POST /api/users - Create a new user
+ PUT /api/users/{id} - Update an existing user
+ DELETE /api/users/{id} - Delete a user by ID

## Instructions
1. Clone the Repository    
   git clone https://github.com/Kaliswari-Swaminathan/UserRegistry_CRUD_App.git  
   cd UserRegistry_CRUD_App  

2. Configure the Application  
   For simplicity, I have used h2 in-memory database. You can find the configuration in the src/main/resources/application.properties file.  
   Change the configuration appropriately if MYSQL database is required.

3. Running the Application  
   You can run the application from your IDE by starting the main() method in the UserRegistryCrudApplication class.

4. Accessing the Application  
   Once the application is running, you can use Postman to test the REST API endpoints

   ### Create a User:
     POST http://localhost:8080/api/users     
     In the POSTMAN body tab, change to raw-JSON type and then in workspace ,Type :    
     '{"username": "kalis", "password": "test", "active": true}'  
     
   ### Get All Users: 
     GET http://localhost:8080/api/users

   ### Get a User by ID:
     GET http://localhost:8080/api/users/1

   ### Update a User:
     PUT http://localhost:8080/api/users/1     
     In the POSTMAN body tab, change to raw-JSON type and then in workspace ,Type :    
     '{"username": "kalis", "password": "demo", "active": true}'
   
   ### Delete a User:
     DELETE http://localhost:8080/api/users/1  

6. H2 Console Access  
   Access the H2 database console at http://localhost:8080/h2-console  
   http://localhost:8080/h2-console  
   JDBC URL: jdbc:h2:mem:testusers  
   Username: kalis  
   Password: password  

  once opened check the database by executing the SQL command.  
  you can also change the username and password by updating : src/main/resources/application.properties file.  
