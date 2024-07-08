package com.emp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_role")
public class Role extends BaseEntity {
    private String name;
    private String status;
    @Column(name = "description")
    private String description;
}
