package com.example.hw2.service;

import com.example.hw2.dao.DepartmentDao;
import com.example.hw2.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentDao departmentDao;
    @Autowired
    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) departmentDao.findAll();
    }

    @Override
    public Department updateDepartment(Department department, String departmentId) {
        Department depDB = departmentDao.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentNumber()) && !"".equalsIgnoreCase(department.getDepartmentNumber())) {
            depDB.setDepartmentNumber(department.getDepartmentNumber());
        }

        return departmentDao.save(depDB);
    }

    @Override
    public void deleteDepartmentById(String departmentId) {
        departmentDao.deleteById(departmentId);
    }
}
