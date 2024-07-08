package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RentalDescType {
    MONTHLY("Monthly"),
    YEARLY("Yearly")
    ;

    private String desc;
}
