package com.emp.entity;

import java.util.Date;

import javax.persistence.*;

import com.emp.constant.StatusType;
import lombok.*;

@Data
@Entity
@Table(name = "t_login")
public class Login extends BaseEntity {
	@Column(name = "user_name")
	private String userName;
	@Column(name = "login_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date loginTime;
	@Column(name = "expire_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date expireTime;
	@Column(name = "logout_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date logoutTime;
	@Column(name = "status")
	private String status = StatusType.ACTIVE.name();
	@Column(name = "token")
	private String token;
	@Column(name = "public_key")
	private String publicKey;
	@Column(name = "private_key")
	private String privateKey;

}
