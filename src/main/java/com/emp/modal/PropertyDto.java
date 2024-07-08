package com.emp.modal;

import java.util.Date;

import javax.persistence.*;

import com.emp.constant.*;
import com.emp.entity.BaseEntity;
import com.emp.entity.Kreator;
import com.emp.entity.PropertyCategory;
import com.emp.entity.PropertyDetail;

import lombok.Data;

@Data

public class PropertyDto extends BaseEntity {
	private String propertyFor;
	private String name;
	private Long rental;
	private String rentalDesc ;
	private String facing;
	private String furnishing;
	private String floorLevel;
	private Long floorSize;
	private Double psf;
	private String currencyType;
	private Integer noOfBeds;
	private Integer noOfBaths;
	private Integer totalUnits;
	private Date builtYear;
	private Date availableFrom;
	private String listingId;
	private String moreAbout;
	private String easyAccess;
	private Long propertyCategoryId;
	private String otherCategory;
}
