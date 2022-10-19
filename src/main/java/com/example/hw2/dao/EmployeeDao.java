package com.example.hw2.dao;

import com.example.hw2.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, String> {
}
