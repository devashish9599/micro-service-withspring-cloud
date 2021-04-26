package com.unthinkablesolutions.employee.service;

import com.unthinkablesolutions.employee.VO.Department;
import com.unthinkablesolutions.employee.VO.ResponseTemplateVO;
import com.unthinkablesolutions.employee.model.Employee;
import com.unthinkablesolutions.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Optional<Employee> getById(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseTemplateVO getEmployeeWithDepartment(Long employeeId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+employee.getDepartmentId()
                ,Department.class);
        vo.setEmployee(employee);
        vo.setDepartment(department);
        return vo;
    }
}
