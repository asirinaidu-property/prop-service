package com.emp.config;

import com.emp.modal.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ExceptionConfig {
	@ExceptionHandler(value = AppException.class)
	public ResponseEntity<Object> handleException(AppException e) {
		log.error("ERROR : {}", e.getClass().getName() + "[" + e.getMessage() + "]");
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(Boolean.FALSE);
		baseResponse.setCode(e.getCode());
		baseResponse.setMessage(e.getMessage());
		return new ResponseEntity<>(baseResponse, HttpStatus.OK);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleException(Exception e) {
		log.error("ERROR : {}\n {}", e.getClass().getName() + "[" + e.getMessage() + "]", e);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(Boolean.FALSE);
		baseResponse.setCode(1000);
		if (e instanceof BadCredentialsException) {
			baseResponse.setMessage("Invalid credentials");
		} else {
			baseResponse.setMessage("Please contact system admin");
		}
		return new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = Throwable.class)
	public ResponseEntity<Object> handleThrowable(Throwable e) {
		log.error("FATAL ERROR : {}\n {}", e.getClass().getName() + "[" + e.getMessage() + "]", e);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setStatus(Boolean.FALSE);
		baseResponse.setCode(1000);
		if (e instanceof BadCredentialsException) {
			baseResponse.setMessage("Invalid credentials");
		} else {
			baseResponse.setMessage("Please contact system admin");
		}
		return new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);
	}

}
