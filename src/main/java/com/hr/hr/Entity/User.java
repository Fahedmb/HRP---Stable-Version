package com.hr.hr.Entity;

import com.hr.hr.Entity.Enum.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    //users can have a role get their roles from the ENUM ERole.
    //Users can only have one role.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private ERole role;

    //Each user has can have 1 or more roles.
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
    //Each user can work on one or more departments.
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    //each user can only be in one team at a time.
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    //Each vacation request can belong to only one user.
    @OneToMany(mappedBy = "user")
    private List<Vacation> vacations;
    //Each task can belong to only one user.
    @OneToMany(mappedBy = "user")
    private List<Task> tasks;
    //Each report belongs to one user and one user only.
    @OneToMany(mappedBy = "user")
    private List<Reports> reports;
    //Each request can belong to only one user.
    @OneToMany(mappedBy = "user")
    private List<Request> requests;

    public User(String username, String email, String encode) {
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
