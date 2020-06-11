package com.example.service;

import com.example.model.Role;

import com.example.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Qualifier("roleRepository")
	@Autowired
  private RoleRepository roleRepository;

	@Override
	public Role findByRole(String role) {
	   Role userRole = roleRepository.findByRole(role); //"ADMIN");
     return  userRole;
	}

}
