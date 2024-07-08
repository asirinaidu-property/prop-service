package com.emp.config;

import com.emp.constant.ErrorEnum;
import lombok.Getter;

import java.util.Map;
@Getter
public class AppException extends RuntimeException {
	private String message;
	private Integer code = 1000;
	private Map<String, String> errMap;

	public AppException(String message) {
		this.message = message;
	}
	public AppException(ErrorEnum errorEnum) {
		this.code = errorEnum.getCode();
		this.message = errorEnum.getMessage();
	}

	public AppException(Map<String, String> map) {
		this.errMap = map;
	}
}
