package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
enum PropertyType {
	RESIDENTIAL("Residential"),
    COMMERCIAL("Commercial");

	private String value;

}
