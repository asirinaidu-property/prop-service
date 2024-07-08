package com.emp.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user_secret")
public class UserSecret extends BaseEntity {
    @Column(name = "login_id", nullable = false)
    private String loginId;
    @Column(name = "password", nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "kreator_id")
    private Kreator kreator;
}
