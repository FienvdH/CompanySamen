package com.company.company.controller;

import com.company.company.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
