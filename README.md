# Drinking Water Supply Management 

A **Java-based project** developed entirely using the **Command Prompt (CMD)** without any IDE.  
This system efficiently manages **drinking water distribution, billing, and customer services**, covering both **Admin** and **Customer** operations.

---

## Overview

The project automates the water supply management process, ensuring smooth coordination between the supplier and customers.  
It allows customers to book water cans online and enables the admin to manage orders, deliveries, and billing efficiently.

---

### Admin Side
- Manage customer registrations and records  
- View and approve customer water can requests  
- Schedule and track deliveries  
- Generate and manage billing information  
- Monitor payment status  

### Customer Side
- Create and manage personal accounts  
- Book water cans for delivery  
- View order history and booking status  
- Check and pay bills  
- Edit or cancel bookings  

---

## Technologies Used
- **Language:** Java (compiled and executed via Command Prompt)  
- **Database:** MySQL  
- **Libraries:** JDBC, MySQL Connector JAR  
- **Tools:** Command Prompt, Notepad  

---

## Project Structure
DrinkingWaterSupplyManagement/
    src/ # Contains all Java source code files (.java)
    bin/ # Contains compiled bytecode files (.class)
    lib/ # Contains external library JAR files (e.g., MySQL Connector)
    README.md # Project documentation file


Each folder serves a specific role:
- **src/** → holds the raw source code where all logic is written.  
- **bin/** → automatically stores compiled files after running `javac`.  
- **lib/** → includes third-party libraries required for JDBC connection.  
- **README.md** → explains how the project works and how to run it.

##  How to Compile and Run (CMD)

Follow these steps to compile and run the project using Command Prompt:

1. **Open Command Prompt** and navigate to your project folder:
   ```bash
   cd path\to\DrinkingWaterSupplyManagement
2. Compile the Java source files:
       javac -cp mysql-connector-j-9.2.0.jar;. Cus.java
       javac -cp ".;mysql-connector-j-9.2.0.jar;javax.mail.jar;jakarta.activation-api-2.0.1.jar;activation-1.1.jar" Watsup.java
3.Run the project:
        java -cp mysql-connector-j-9.2.0.jar;. Cus
        java -cp ".;mysql-connector-j-9.2.0.jar;javax.mail.jar;jakarta.activation-api-2.0.1.jar;activation-1.1.jar" Watsup
4.Make sure your MySQL database is running before execution.

##  Database Setup

1. **Open MySQL** and create a new database:
   ```sql
   CREATE DATABASE water_management;
2.Create required tables:
CREATE TABLE users (
        username VARCHAR(50),
        pwd      VARCHAR(50)
);
create table delivery(
        orderno INT,
        Delivery_date DATE,
        cus_name varchar(30),
        address varchar(30),
        city varchar(10),
        pincode INT,
        contact_no INT,
        quantity INT   
);
create table customers(
        id INT primary key,
        username varchar(30),
        passwd varchar(30),
        name varchar(30),
        address varchar(30),
        city varchar(30),
        pincode INT,
        mobileno INT,
        mailid varchar(30)
);
create table orders(
        cid INT,
        cname varchar(30),
        caddress varchar(30),
        ccity varchar(30),
        cpincode varchar(30),
        cmobileno varchar(30),
        cmailid varchar(30),
        orderno varchar(30),
        orderdate date,
        orderqty int
);
create table supplier(
        Id INT primary key,
        sname varchar(30),
        doorno varchar(30),
        a_name varchar(30),
        c_name varchar(30),
        pincode varchar(30),
        contno varchar(10)
);
CREATE TABLE FILLEDCANS(
    	  crn INT primary key,
        crd DATE,
        sid INT,
        s_name varchar(30),
        rq INT
);
3.Update your JDBC connection in the Java code with your MySQL credentials
String url = "jdbc:mysql://localhost:3306/water_management";
String user = "root";
String password = "your_password";
Connection con = DriverManager.getConnection(url, user, password);
4.Start the MySQL server before running the project

##  Screenshots

Below are some sample screenshots from the project (captured from Command Prompt):

| Feature | Screenshot |
|----------|-------------|
| Admin Login |(screenshots/admin login page)* |
| Admin Dashboard |(screenshots/admin side dashboard)|
| Filled Can Entry |(screenshots/filled can entry)|
| Customer login | (screenshots/customer login) |
| Customer account creation | (screenshots/customer account creation) |
| Booking cans | (screenshots/customer order placing) |

##  Future Improvements
- Add a GUI using JavaFX or Swing for better user experience  
- Add online payment integration 
- Host the project on a local or cloud server  

---

## Author
**Aravind J**  
Developed completely using **Command Prompt (no IDE)**  
[GitHub Profile](https://github.com/Aravindarun2005)

