package com.emp.controller;

import com.emp.modal.BaseResponse;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public class BaseController {

	protected ResponseEntity<String> getResponse(BaseResponse baseResponse) {
		String resStr = new GsonBuilder().create().toJson(baseResponse);
		if (baseResponse.isStatus()) {
			return new ResponseEntity<>(resStr, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(resStr, HttpStatus.BAD_REQUEST);
		}
	}

}
