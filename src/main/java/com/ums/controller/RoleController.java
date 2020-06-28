package com.ums.controller;

import java.util.List;

import com.ums.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ums.model.Role;
import com.ums.service.RoleService;

@RestController
@RequestMapping("api/v1")
public class RoleController {

	private Logger log = LoggerFactory.getLogger(RestController.class);
	
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

	@PostMapping("events")
	public String getEvents(@RequestBody Event event){
		log.info("Event received from procore :: " + event);
		return "Event has been received from procore successfully..!!";
	}

}
