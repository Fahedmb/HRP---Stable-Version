package com.hr.hr.ServiceImpl;

import com.hr.hr.Entity.Reports;
import com.hr.hr.Repository.ReportRepository;
import com.hr.hr.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepository reportrepository;

    @Override
    public Reports createReport(Reports report) {
        return reportrepository.save(report);
    }

    @Override
    public Reports updateReport(Reports report) {
        return reportrepository.save(report);
    }

    @Override
    public Reports getReportById(Long id) {
        return reportrepository.findById(id).orElse(null);
    }

    @Override
    public List<Reports> getAllReports() {
        return reportrepository.findAll();
    }

    @Override
    public void deleteReport(Long id) {
        reportrepository.deleteById(id);
    }
}
