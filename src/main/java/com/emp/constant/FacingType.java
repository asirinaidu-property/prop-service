package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FacingType {
    EAST("East"),
    NORTH("North"),
    WEST("West"),
    SOUTH("South"),
    ;

    private String desc;
}
