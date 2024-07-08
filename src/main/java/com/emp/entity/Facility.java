package com.emp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_facility")
public class Facility extends BaseEntity {
    private String type;
    private String name;
}
