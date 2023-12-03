package com.hr.hr.Service;

import com.hr.hr.Entity.Reports;

import java.util.List;

public interface ReportService {
    Reports createReport(Reports report);
    Reports updateReport(Reports report);
    Reports getReportById(Long reportId);
    List<Reports> getAllReports();
    void deleteReport(Long reportId);
}
