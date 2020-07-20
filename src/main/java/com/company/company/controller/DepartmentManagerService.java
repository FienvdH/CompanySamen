package com.company.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.company.domain.DepartmentManager;





@Service
@Transactional
public class DepartmentManagerService {
	
	@Autowired
	DepartmentManagerRepository dr;
	
	public void inDeService() {
		dr.save(new DepartmentManager());		
		System.out.println("We zijn hier in de DepartmentManagerService.");
	}
	
	public Iterable<DepartmentManager> geefAlleManagers(){
		return dr.findAll();
	}

}
