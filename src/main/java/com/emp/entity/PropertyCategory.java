package com.emp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_property_category")
public class PropertyCategory extends BaseEntity {
    @Column(name = "cat_one")
    private String catOne;
    @Column(name = "cat_two")
    private String catTwo;
    @Column(name = "cat_three")
    private String catThree;
}

