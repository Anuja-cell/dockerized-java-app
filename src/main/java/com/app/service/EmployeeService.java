package com.app.service;

import com.app.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployee(int id);

    List<Employee> getAllEmployee();

    Employee updateEmployee(int id, Employee employee);

    String deleteEmployee(int id);
}
