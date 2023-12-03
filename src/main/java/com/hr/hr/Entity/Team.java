package com.hr.hr.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "team")
public class Team {
    //created by the admin.
    //the admin can associate a team leader to his team.
    //the team-leader can then add employee to assemble his team.
    //each team can only work on one project.
    //the is only one team working on one project for each department.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;
    private String name;
    private String description;
    private LocalDateTime Created_at;
    @OneToMany(mappedBy = "team")
    private List<User> users;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    public static void setId(Long teamId) {
    }
}
