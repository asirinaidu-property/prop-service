package com.emp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_kreator")
public class Kreator extends BaseEntity {
    @Column(name = "login_id")
    private String loginId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}

