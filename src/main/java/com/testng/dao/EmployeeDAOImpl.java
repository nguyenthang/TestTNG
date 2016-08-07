package com.testng.dao;

import com.testng.exception.EmployeeDuplicateException;
import com.testng.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by thangnguyen-imac on 8/7/16.
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    public List<Employee> getListEmployees(){
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee();
        employee1.setId(Long.parseLong(UUID.randomUUID().toString()));

        employee1.setFirstName("Thang");
        employee1.setLastName("Nguyen");
        employee1.setSalary(1000F);

        employees.add(employee1);


        Employee employee2 = new Employee();
        employee2.setId(Long.parseLong(UUID.randomUUID().toString()));
        employee2.setFirstName("Thang 2");
        employee2.setLastName("Nguyen");
        employee2.setSalary(2000F);

        employees.add(employee2);


        Employee employee3 = new Employee();
        employee3.setId(Long.parseLong(UUID.randomUUID().toString()));
        employee3.setFirstName("Thang 3");
        employee3.setLastName("Nguyen");
        employee3.setSalary(3000F);

        employees.add(employee3);

        return employees;
    }

    public void createEmployee(Employee employee) throws EmployeeDuplicateException {

        List<Employee> employees = getListEmployees();

        for(Employee e : employees){
            if(e.getId().equals(employee.getId())){
                throw new EmployeeDuplicateException("Employee Duplicated");
            }
        }

        System.out.println("Created");

    }

    public void deleteEmployee(Employee employee) {

    }

    public boolean updateEmployee(Employee employee) {
        return false;
    }

    public List<Employee> getAllEmployees() {
        return this.getListEmployees();
    }
}
