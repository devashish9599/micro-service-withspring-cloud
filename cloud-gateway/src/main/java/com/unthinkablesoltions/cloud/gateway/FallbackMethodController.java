package com.unthinkablesoltions.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/employeeServiceFallBack")
    public String employeeServiceFallbackMethod(){
        return "Employee service not working try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallbackMethod(){
        return "Department service not working try again later";
    }
}
