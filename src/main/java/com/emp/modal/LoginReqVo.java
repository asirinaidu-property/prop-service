package com.emp.modal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginReqVo {
    private String userId;
    private String userPwd;
}
