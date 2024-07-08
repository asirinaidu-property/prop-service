package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FloorLevelType {
    GROUND("Ground"),
    LOW("Low"),
    MID("Mid"),
    HIGH("High"),
    PENT_HOUSE("Penthouse")
    ;

    private String desc;
}
