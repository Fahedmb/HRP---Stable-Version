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
@Table(name = "task")
public class Task {
    //Only users who have Employee as role can be assigned tasks.
    //Only users who have Team-Leader as role can assign tasks to Employees.
    //Tasks have assignment date and a deadline.
    //Team-Leaders must specify the task's complexity and priority before assigning them to an Employee.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String name;
    private String description;
    private int complexity;
    private int priority;
    private LocalDateTime starting_time;
    private LocalDateTime finishing_time;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public static void setId(Long taskId) {
    }
}
