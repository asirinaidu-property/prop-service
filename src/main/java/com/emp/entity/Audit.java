package com.emp.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "t_audit")
public class Audit extends BaseEntity {
	@Column(name = "remote_host")
	private String remoteHost;
	@Column(name = "end_point")
	private String endPoint;
	@Column(name = "req_txt")
	private String reqTxt;
	@Column(name = "res_txt")
	private String resTxt;
	@Column(name = "status")
	private String status;
	@Column(name = "start_time")
	@Temporal(TemporalType.TIME)
	private Date startTime;
	@Column(name = "end_time")
	@Temporal(TemporalType.TIME)
	private Date endTime;
	@Column(name = "total_time")
	private Long totalTime;
}
