# Spring Boot Student Management API





This is a RESTful API for managing student information. The API provides endpoints for performing CRUD operations on student data.

## Features
- Add a single student or a list of students.
- Fetch all students or a specific student by ID.
- Update student details.
- Delete a student by ID.
- A root endpoint to check the server's status.
Endpoints
- HTTP Method	Endpoint	Description
- POST	/addStudent	Add a single student
- POST	/saveList	Add a list of students
- GET	/	Check if the server is running
- GET	/Alldetails	Get all student details
- GET	/getStudentBysId/{id}	Fetch a student by their ID
- PUT	/updateStudent	Update student details
- DELETE	/Delete/{id}	Delete a student by their ID
Technologies Used
- Spring Boot: Framework for building the API.
-Spring Data JPA: For database interaction.
- H2/MySQL: Database for storing student data (use whichever is configured).
## Getting Started 🚀
### Prerequisites
- Java 11 or higher
- Maven
- A database (e.g., MySQL or H2)
- Run Locally
- Clone the repository:


### API Usage
Use tools like Postman or cURL to test the API endpoints.
For /addStudent, /saveList, and /updateStudent, provide student data in JSON format:
```json
{
  "id": 1,
  "mark": 21,
  "name": "John Doe"

}

```



### Contributing 🪄
Contributions are welcome! Fork the repository and create a pull request for changes.


#### Disclaimer : 
Even though I have tried my best yet some error may occur because it's my first project with springboot and Api building.
> Thanks !
