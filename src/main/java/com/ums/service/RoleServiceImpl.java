package com.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.model.Role;
import com.ums.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository repo;

	@Override
	public List<Role> getRoles() {
		return repo.findAll();
	}

}
