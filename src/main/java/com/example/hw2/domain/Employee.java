package com.example.hw2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
    private int jobLevelId;
    private String departmentId;
    private String emailId;
    private String managerId;

}
