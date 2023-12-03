package com.hr.hr.Repository;

import com.hr.hr.Entity.Reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Reports, Long> {
}
