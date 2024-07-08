package com.emp.entity;

import java.util.Date;

import javax.persistence.*;

import com.emp.constant.FloorLevelType;
import com.emp.constant.FurnishingType;
import com.emp.constant.RentalDescType;

import lombok.Data;

@Data
@Entity
@Table(name = "t_property_backup")
public class PropertyBackup extends BaseEntity {
	@Column(name = "property_for")
	private String propertyFor;
	@Column(name = "name")
	private String name;
	@Column(name = "rental")
	private Long rental;
	@Column(name = "rental_desc")
	private String rentalDesc = RentalDescType.MONTH.getDesc();
	@Column(name = "facing")
	private String facing;
	@Column(name = "furnishing")
	private String furnishing = FurnishingType.FULLY_FURNISHED.getDesc();
	@Column(name = "floor_level")
	private String floorLevel = FloorLevelType.GROUND.getDesc();
	@Column(name = "floor_size", columnDefinition = "floor size in square feet")
	private Long floorSize;
	@Column(name = "psf", columnDefinition = "price for square feet")
	private Double psf;
	@Column(name = "no_of_beds")
	private Integer noOfBeds;
	@Column(name = "no_of_baths")
	private Integer noOfBaths;
	@Column(name = "total_units")
	private Integer totalUnits;
	@Column(name = "build_year")
	private Date builtYear;
	@Column(name = "available_from")
	@Temporal(TemporalType.DATE)
	private Date availableFrom;
	@Column(name = "listing_id")
	private String listingId;
	@Column(name = "more_about", columnDefinition = "more info about the unit")
	private String moreAbout;
	@Column(name = "easy_access", columnDefinition = "near by places and way to reach unit")
	private String easyAccess;
	@ManyToOne
	@JoinColumn(name = "property_type_id")
	private PropertyCategory propertyCategory;
	@ManyToOne
	@JoinColumn(name = "property_detail_id")
	private PropertyDetail propertyDetail;
}
