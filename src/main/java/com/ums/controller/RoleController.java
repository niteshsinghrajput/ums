package com.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ums.model.Role;
import com.ums.service.RoleService;

@RestController
@RequestMapping("api/v1")
public class RoleController {
	
	@Autowired
	private RoleService service;
	
	
	@GetMapping("health")
	public String health() {
		return "UMS is up and running...!!!";
	}

	@GetMapping("roles")
	public List<Role> getRoles(){
		return service.getRoles();
	}
	
}
