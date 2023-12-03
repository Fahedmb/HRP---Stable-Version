package com.hr.hr.Entity;

import com.hr.hr.Entity.Enum.Request_type;
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
@Table(name = "request")
public class Request {
    //Requests are submitted by users.
    //Request types are defined in the ENUM Request_Type.
    //Requests are handled by the maintenance agent, HR, Team-Leader or even the admin if need be.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    @Enumerated(EnumType.STRING)
    private Request_type type;
    private String name;
    private String description;
    private LocalDateTime Submitted_at;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public static void setId(Long requestId) {
    }
}
