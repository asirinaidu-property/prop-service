package com.emp.modal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResVo {
    private String userName;
    private String jwtToken;
}
