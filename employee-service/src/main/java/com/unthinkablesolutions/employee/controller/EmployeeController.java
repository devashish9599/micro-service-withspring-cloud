package com.unthinkablesolutions.employee.controller;

import com.unthinkablesolutions.employee.VO.ResponseTemplateVO;
import com.unthinkablesolutions.employee.model.Employee;
import com.unthinkablesolutions.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getEmployeeWithDepartment(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeWithDepartment(employeeId);
    }
}
