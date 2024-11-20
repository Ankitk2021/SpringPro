package com.springpro.springpro.Entity;

import jakarta.persistence.*;
//jakarta supports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //this helps to auto generate getter setter of each member by default
@Table(name="STUDENT_DB") //to give name of table
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id //to represent id as primary key.
    @Column(name="ID")
    @GeneratedValue //to auto generate unique values in id column
    private int id ;
    @Column(name="MARK")
    private int mark;
    @Column(name="NAME")
    private String name;
}
//Entity or Student class helps us to create database or table in mysql database