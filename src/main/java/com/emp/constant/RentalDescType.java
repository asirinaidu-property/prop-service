package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RentalDescType {
    MONTH("Monthly"),
    YEAR("Yearly")
    ;

    private String desc;
}
