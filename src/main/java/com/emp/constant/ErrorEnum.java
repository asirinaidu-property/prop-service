package com.emp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorEnum {
    INVALID_INPUT(1000,"Invalid input");
    public Integer code;
    private String message;
}
