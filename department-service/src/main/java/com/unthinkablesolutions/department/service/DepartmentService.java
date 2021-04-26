package com.unthinkablesolutions.department.service;

import com.unthinkablesolutions.department.model.Department;
import com.unthinkablesolutions.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside Department service method - saveDepartment");
        return departmentRepository.save(department);
    }

    public Optional<Department> findById(Long id) {
        log.info("Inside Department service method - findById");
        return departmentRepository.findById(id);
    }
}
