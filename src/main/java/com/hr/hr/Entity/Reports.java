package com.hr.hr.Entity;

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
@Table(name = "reports")
public class Reports {
    //users can summit reports.
    //reports are handled by the team-leader, HR or even the admin if need be.
    //reports can be anonymous or public.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reasonId;
    private String Reason;
    private String Description;
    private LocalDateTime Submission_date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public static void setId(Long reportId) {
    }
}
