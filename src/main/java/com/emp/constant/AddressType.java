package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {
    CURRENT("Current"),

    PERMANENT("Permanent ");

    private String desc;
}
