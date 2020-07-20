package com.company.company.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.company.company.domain.DepartmentManager;


@Component
public interface DepartmentManagerRepository extends CrudRepository<DepartmentManager, Long>{

}
