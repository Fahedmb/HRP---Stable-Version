package com.hr.hr.Entity;

import com.hr.hr.Entity.Enum.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
    //the company is divided into departments
    //the department names are defined in Department_Name
    //more than one department can one on the same project at the same time
    //each department has its teams
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Enumerated(EnumType.STRING)
    private Department_Name name;

    private String city;
    private String description;

    @OneToMany(mappedBy = "department")
    private List<User> users;
    @ManyToMany
    @JoinTable(
            name = "department_project",
            joinColumns = @JoinColumn(name = "department_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects = new LinkedHashSet<>();

    public static void setId(Long departmentId) {
        // Your existing method implementation (if needed)
    }
}
