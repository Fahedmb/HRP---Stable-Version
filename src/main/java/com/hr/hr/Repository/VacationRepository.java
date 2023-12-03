package com.hr.hr.Repository;

import com.hr.hr.Entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
