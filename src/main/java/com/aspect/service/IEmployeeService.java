package com.aspect.service;

import com.aspect.models.Employee;

/**
 * @author praveenkamath
 **/
public interface IEmployeeService {

    /**
     * Fetches employee details by id
     *
     * @param id employee id
     * @return
     */
    Employee fetchEmployee(final String id);

    boolean isValidEmployee(final String id);
}
