package com.hr.hr.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private float budget;
    @OneToMany(mappedBy = "project")
    private List<Team> teams;
    @ManyToMany(mappedBy = "projects")
    private Set<Department> departments = new LinkedHashSet<>();

}
