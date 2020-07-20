package com.company.company.rest;

import com.company.company.controller.EmployeeService;
import com.company.company.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndpoint {
    @Autowired
    EmployeeService es;

    @GetMapping("/testmappingemployee")
        public String endpointAanroepenEmployee(){
        System.out.println("Het werkt!!");
        return "ik zeg wat terug:-)";

    }

//    @GetMapping("/hoppakee")
//    public Employee employeeOproep(){
//        System.out.println("endpoint aangeroepen van hoppakee ");
//        return es.inDeEmployeeService();
//    }

    @GetMapping("/jojo")
        public Iterable<Employee> checkDeService(){
        return es.geefAlleEmployees();
    }


}




