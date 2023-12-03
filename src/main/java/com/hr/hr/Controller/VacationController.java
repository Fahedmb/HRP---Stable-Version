package com.hr.hr.Controller;

import com.hr.hr.Entity.Vacation;
import com.hr.hr.Service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacation")
public class VacationController {
    @Autowired
    private VacationService vacationService;
    @PostMapping
    public Vacation createVacation(@RequestBody Vacation vacation) {
        return vacationService.createVacation(vacation);
    }

    @GetMapping("/{id}")
    public Vacation getVacationById(@PathVariable Long id) {
        return vacationService.getVacationById(id);
    }

    @GetMapping
    public List<Vacation> getAllVacations() {
        return vacationService.getAllVacations();
    }

    @PutMapping("/{vacationId}")
    public Vacation updateVacation(@PathVariable Long vacationId, @RequestBody Vacation vacation) {
        Vacation.setId(vacationId);
        return vacationService.updateVacation(vacation);
    }

    @DeleteMapping("/{id}")
    public void deleteVacation(@PathVariable Long id) {
        vacationService.deleteVacation(id);
    }

}
