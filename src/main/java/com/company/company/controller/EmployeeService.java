package com.company.company.controller;

import com.company.company.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository er;

    public void inDeEmployeeService(){
        er.save(new Employee());
        System.out.println("We zijn in de employee service");
    }

    public Iterable<Employee> geefAlleEmployees(){
        return er.findAll();
    }

}
