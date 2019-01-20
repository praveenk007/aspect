package com.aspect.service.impl;

import com.aspect.models.Employee;
import com.aspect.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author praveenkamath
 **/
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Override
    public Employee fetchEmployee(String id) {
        // Calls dao layer to fetch employee details
        return null;
    }

    @Override
    public boolean isValidEmployee(String id) {
        System.out.println("[isValidEmployee]");
        return true;
    }
}
