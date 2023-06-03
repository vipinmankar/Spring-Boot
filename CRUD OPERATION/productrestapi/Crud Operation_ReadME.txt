This project included RESTful end to create a new record, to update existing record, to delete record, to list all records, and to partial search from existing records. I have used spring boot 3.9.0 and spring data jpa for the CRUD. MySQL as database.

Technologies Used
	•	Spring Boot
	•	MySQL
	•	Hibernate/JPA

IDE used
	•	 STS -3.9.0



	•	Brief Discreption  -

packages  -

	•	package com.example.sms;
	•	package com.example.sms.controller
	•	package com.example.sms.entities;
	•	package com.example.sms.repos;

File-

ProductrestapiApplication - 

This file contain entry point of the spring boot application is the class that contains @SpringBootApplication annotation and the main method. Spring Boot automatically scans all the components included in the project by using @ComponentScan annotation.


ProductRestController —

This file controller classes in Spring are annotated either by the @Controller or the @RestController annotation. These mark controller classes as a request handler to allow Spring to recognize it as a RESTful service during runtime.

Here I have run this application in localhost and 8883 port. You can change the port as you wish.

Product-

Consist of POJO class. Consist of getter and setter.

http://localhost:8080/product/save
This API will save an employee in employee database. (a record will insert to employee table).

http://localhost:8080/products/
This API will give details of all the employees as a List.

http://localhost:8080//products/{id}
This API will give details of the employee, that we send the employee id in the url.

http://localhost:8080/delete
This API will give delete the employee, that we send the employee id in the url.(delete the record of that employee from employee table)

http://localhost:8080/update
This API will update the details of an employee. (update the employee table)







