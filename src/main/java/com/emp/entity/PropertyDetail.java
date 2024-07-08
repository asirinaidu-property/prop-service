package com.emp.entity;

import java.util.Date;

import javax.persistence.*;

import com.emp.constant.FloorLevelType;
import com.emp.constant.FurnishingType;
import com.emp.constant.RentalDescType;

import lombok.Data;

@Data
@Entity
@Table(name = "t_property_detail")
public class PropertyDetail extends BaseEntity {
	@Column(name = "more_about")
	private String moreAbout;
	@Column(name = "easy_access")
	private String easyAccess;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Kreator owner;
	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Kreator agent;
}
