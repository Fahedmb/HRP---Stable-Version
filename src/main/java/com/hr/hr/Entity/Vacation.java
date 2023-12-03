package com.hr.hr.Entity;

import com.hr.hr.Entity.Enum.Vacation_Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vacation")
public class Vacation {
    //Users can request vacations.
    //Vacation requests are either granted or designed by the HR.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vacationId;
    private String Reason;
    private String Description;
    private LocalDateTime Submission_date;
    private LocalDateTime Starting_date;
    private LocalDateTime Finishing_date;
    @Enumerated(EnumType.STRING)
    private Vacation_Status vacation_status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public static void setId(Long vacationId) {
    }
}
