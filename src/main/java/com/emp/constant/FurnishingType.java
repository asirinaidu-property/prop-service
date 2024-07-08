package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FurnishingType {
    FULLY_FURNISHED("Fully Furnished"),
    SEMI_FURNISHED("Semi Furnished"),
    UN_FURNISHED("Un Furnished");

    private String desc;
}
