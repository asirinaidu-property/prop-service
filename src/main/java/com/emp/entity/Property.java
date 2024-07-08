package com.emp.entity;

import java.util.Date;

import javax.persistence.*;

import com.emp.constant.*;

import lombok.Data;

@Data
@Entity
@Table(name = "t_property")
public class Property extends BaseEntity {
	@Column(name = "property_for")
	private String propertyFor= PropertyForType.RENT.getDesc();
	@Column(name = "name")
	private String name;
	@Column(name = "rental")
	private Long rental;
	@Column(name = "rental_desc")
	private String rentalDesc = RentalDescType.MONTHLY.getDesc();
	@Column(name = "facing")
	private String facing;
	@Column(name = "furnishing")
	private String furnishing = FurnishingType.FULLY_FURNISHED.getDesc();
	@Column(name = "floor_level")
	private String floorLevel = FloorLevelType.GROUND.getDesc();
	@Column(name = "floor_size")
	private Long floorSize;
	@Column(name = "psf")
	private Double psf;
	@Column(name = "currency_type")
	private String currencyType = CurrencyType.INR.name();
	@Column(name = "no_of_beds")
	private Integer noOfBeds;
	@Column(name = "no_of_baths")
	private Integer noOfBaths;
	@Column(name = "total_units")
	private Integer totalUnits;
	@Column(name = "build_year")
	@Temporal(TemporalType.DATE)
	private Date builtYear;
	@Column(name = "available_from")
	@Temporal(TemporalType.DATE)
	private Date availableFrom;
	@Column(name = "listing_id")
	private String listingId;
	@ManyToOne
	@JoinColumn(name = "property_category_id")
	private PropertyCategory propertyCategory;
	@ManyToOne
	@JoinColumn(name = "property_detail_id")
	private PropertyDetail propertyDetail;
}
