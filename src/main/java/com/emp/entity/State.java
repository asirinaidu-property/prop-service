package com.emp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_state")
public class State extends BaseEntity {
    private String code;
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
