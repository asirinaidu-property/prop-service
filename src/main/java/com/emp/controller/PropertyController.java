package com.emp.controller;

import com.emp.modal.BaseResponse;
import com.emp.modal.CreatePropReq;
import com.emp.modal.CreatePropRes;
import com.emp.service.PropertyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/prop")
public class PropertyController extends BaseController {
	@Autowired
	PropertyService propertyService;

	@PostMapping(value = "/create-lead")
	public ResponseEntity<String> saveProp(@RequestBody CreatePropReq request, HttpServletRequest httpRequest) {
		BaseResponse<CreatePropRes> baseResponse = new BaseResponse<>(new CreatePropRes());
		propertyService.saveProperty(request, baseResponse);
		return getResponse(baseResponse);
	}

}
