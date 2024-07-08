package com.emp.dao;

import com.emp.modal.LoginResVo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class RepoFactory {
	@Autowired
	LoginRepo loginRepo;
}
