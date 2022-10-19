package com.example.hw2.service;

import com.example.hw2.domain.Department;

import java.util.List;

public interface DepartmentService {
    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department, String departmentId);

    // Delete operation
    void deleteDepartmentById(String departmentId);
}
