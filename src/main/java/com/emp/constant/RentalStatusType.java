package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RentalStatusType {
    AVAILABLE("Available"),

    OCCUPIED("Occupied");
    private String desc;
}
