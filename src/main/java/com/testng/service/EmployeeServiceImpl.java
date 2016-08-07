package com.testng.service;

import com.testng.dao.EmployeeDAO;
import com.testng.exception.EmployeeDuplicateException;
import com.testng.model.Employee;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/7/16.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public void createEmployee(Employee employee) throws EmployeeDuplicateException {
        employeeDAO.createEmployee(employee);
    }

    public void deleteEmployee(Employee employee) {

    }

    public boolean updateEmployee(Employee employee) {
        return false;
    }

    public List<Employee> getAllEmployees() {
        return null;
    }
}
