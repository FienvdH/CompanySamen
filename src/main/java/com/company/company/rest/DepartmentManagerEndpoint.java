package com.company.company.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.company.controller.DepartmentManagerService;
import com.company.company.domain.DepartmentManager;



@RestController
public class DepartmentManagerEndpoint {
	
	@Autowired
	DepartmentManagerService ds;
	
	@GetMapping("/check")
	public Iterable<DepartmentManager> checkDepartmentManager() {
		System.out.println("in endpoint check de service");
		ds.inDeService();
		return ds.geefAlleManagers();
		
		
	}
	
	/*@GetMapping("/hoppakee")     
	public void departmentManagerOproep(){         
		System.out.println("endpoint aangeroepen van hoppakee ");         
		    }*/
}
