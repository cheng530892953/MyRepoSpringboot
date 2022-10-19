package com.example.hw2.controller;

import com.example.hw2.domain.Department;
import com.example.hw2.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    private final DepartmentServiceImpl departmentService;
    @Autowired
    public DepartmentController(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("/department")
    public List<Department> getDep(){
        return departmentService.fetchDepartmentList();
    }
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") String departmentId)
    {
        return departmentService.updateDepartment(department, departmentId);
    }
}
