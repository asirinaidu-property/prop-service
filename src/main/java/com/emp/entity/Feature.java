package com.emp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_feature")
public class Feature extends BaseEntity {
    private String type;
    private String name;
}
