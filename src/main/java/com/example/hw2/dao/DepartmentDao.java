package com.example.hw2.dao;

import com.example.hw2.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,String> {
}
