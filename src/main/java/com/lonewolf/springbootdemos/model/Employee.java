package com.lonewolf.springbootdemos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name = "FirstName" )
    private String firstName;
    @Column(name = "LastName" )
    private String lastName;
    @Column(name = "EmailID")
    private String email;


}
