package com.emp.controller;

import com.emp.modal.BaseResponse;
import com.emp.service.PropertyService;
import com.emp.config.AppException;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Slf4j
@RestController
@RequestMapping(value = "/prop")
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    private void updateRes(BaseResponse baseRes, Exception e) {
        String message = null;
        if (e instanceof AppException) {
            AppException appEx = (AppException) e;
            if (Objects.nonNull(appEx.getErrMap())) {
                message = appEx.getErrMap().toString();
            } else {
                message = e.getMessage();
            }
        } else {
            message = e.getMessage();
        }
        baseRes.setStatus(Boolean.FALSE);
        baseRes.setMessage(message);
    }

    private ResponseEntity<String> genResponse(BaseResponse baseResponse) {
        String resStr = new GsonBuilder().create().toJson(baseResponse);
        if (baseResponse.isStatus()) {
            return new ResponseEntity<>(resStr, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(resStr, HttpStatus.BAD_REQUEST);
        }
    }
}
