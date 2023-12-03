package com.hr.hr.Controller;

import com.hr.hr.Entity.Reports;
import com.hr.hr.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportsController {
    @Autowired
    private ReportService reportService;
    @PostMapping
    public Reports createReport(@RequestBody Reports report) {
        return reportService.createReport(report);
    }

    @GetMapping("/{id}")
    public Reports getReportById(@PathVariable Long id) {
        return reportService.getReportById(id);
    }

    @GetMapping
    public List<Reports> getAllReports() {
        return reportService.getAllReports();
    }

    @PutMapping("/{reportId}")
    public Reports updateReport(@PathVariable Long reportId, @RequestBody Reports report) {
        Reports.setId(reportId);
        return reportService.updateReport(report);
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Long id) {
        reportService.deleteReport(id);
    }
}
