package com.unthinkablesolutions.department.controller;

import com.unthinkablesolutions.department.model.Department;
import com.unthinkablesolutions.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside Department controller method - saveDepartment");
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/{departmentId}")
    public Optional<Department> findById(@PathVariable Long departmentId){
        log.info("Inside Department controller method - findById");
        return departmentService.findById(departmentId);
    }
}
