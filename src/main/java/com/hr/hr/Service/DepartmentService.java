package com.hr.hr.Service;

import com.hr.hr.Entity.Department;
import com.hr.hr.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);
    Department updateDepartment(Department department);
    Department getDepartmentById(Long departmentId);
    List<Department> getAllDepartments();
    void deleteDepartment(Long DepartmentId);
}
