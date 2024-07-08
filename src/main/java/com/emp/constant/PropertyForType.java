package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyForType {
	RENT("Rent"),
    BUY("Buy");

	private String desc;

}
