package com.company.company.rest;

import com.company.company.controller.EmployeeService;
import com.company.company.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeEndpoint {
    @Autowired
    EmployeeService es;

    @GetMapping("/testmappingemployee")
        public String endpointAanroepenEmployee(){
        System.out.println("Het werkt!!");
        return "ik zeg wat terug:-)";

    }

    @GetMapping("/jojo")
        public Iterable<Employee> checkEmployeeService(){
        System.out.println("In de service employee");
        es.inDeEmployeeService();
        return es.geefAlleEmployees();
    }


}




