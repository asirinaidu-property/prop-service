package com.emp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_district")
public class District extends BaseEntity {
    private String code;
    private String name;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
}
