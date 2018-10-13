#poc
Below are the assumptions taken for this poc:-
1)Employee and department has ManyToOne relationship.
2)Spring boot application will run on 8080 port.
3)Angular App will run on 4200 port.

Below are the technology stack used for poc :-
1)Spring-Boot
2)Spring-Data
3)Angular 6
4)Rest API
5)MySQL
6)JUnit-Mockito

Steps to run this project :-
1)Create database  schema named Registration and then create below 2 tables using below query
  a)create database Registration;
  b)CREATE TABLE `Employee` (
	`Employee_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`First_name` VARCHAR(50) NULL DEFAULT NULL,
	`Last_name` VARCHAR(50) NULL DEFAULT NULL,
	`Gender` VARCHAR(50) NULL DEFAULT NULL,
	`DOB` DATE NULL DEFAULT NULL,
	`Department_id` BIGINT(20) NULL DEFAULT NULL,
	primary key (Employee_id)
)

c)CREATE TABLE `Department` (
	`Department_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50) ,
	primary key (Department_id)
)
2)Import EmployeeRegistration project as existing maven project.
3)Run npm install
4)Using @angular/cli run EmployeeRegistrationApp project using command.
    ng serve
5)Start spring boot application.
6)Application will be running on url :- localhost:4200/
7)For running test cases run EmployeeRegistrationApplicationTests.class as Junit test cases.
