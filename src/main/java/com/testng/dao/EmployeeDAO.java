package com.testng.dao;

import com.testng.exception.EmployeeDuplicateException;
import com.testng.exception.EmployeeNotFoundException;
import com.testng.model.Employee;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/7/16.
 */
public interface EmployeeDAO {

    public void createEmployee(Employee employee) throws EmployeeDuplicateException;

    public void deleteEmployee(Employee employee) throws EmployeeNotFoundException;

    public boolean updateEmployee(Employee employee) throws EmployeeNotFoundException;;

    public List<Employee> getAllEmployees();

}
