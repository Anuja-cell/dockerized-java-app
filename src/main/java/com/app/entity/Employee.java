package com.app.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Employee_Details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String fname;
    String lname;
    String email;
//    String address;
//    long phoneno;


}
