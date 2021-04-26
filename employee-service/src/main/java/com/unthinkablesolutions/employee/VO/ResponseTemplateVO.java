package com.unthinkablesolutions.employee.VO;

import com.unthinkablesolutions.employee.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private Employee employee;
    private Department department;

}
