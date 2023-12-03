package com.hr.hr.Repository;

import com.hr.hr.Entity.Department;
import com.hr.hr.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
