package com.hr.hr.ServiceImpl;

import com.hr.hr.Entity.Vacation;
import com.hr.hr.Repository.VacationRepository;
import com.hr.hr.Service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationServiceImpl implements VacationService {
    @Autowired
    private VacationRepository vacationRepository;

    @Override
    public Vacation createVacation(Vacation Vacation) {
        return vacationRepository.save(Vacation);
    }

    @Override
    public Vacation updateVacation(Vacation Vacation) {
        return vacationRepository.save(Vacation);
    }

    @Override
    public Vacation getVacationById(Long id) {
        return vacationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vacation> getAllVacations() {
        return vacationRepository.findAll();
    }

    @Override
    public void deleteVacation(Long id) {
        vacationRepository.deleteById(id);
    }
}
