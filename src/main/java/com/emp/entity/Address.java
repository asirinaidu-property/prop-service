package com.emp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_address")
public class Address extends BaseEntity {
    @Column(name = "type")
    private String type;
    @Column(name = "line1")
    private String line1;
    @Column(name = "line2")
    private String line2;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "post_code")
    private String postCode;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @ManyToOne
    @JoinColumn(name = "kreator_id")
    private Kreator kreator;
}

