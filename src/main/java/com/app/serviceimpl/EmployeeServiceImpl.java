package com.app.serviceimpl;

import com.app.entity.Employee;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Element not found! with id "+ id)) ;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).get();


        if (existingEmployee != null){

            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setFname(employee.getFname());
            existingEmployee.setLname(employee.getLname());
//            existingEmployee.setAddress(employee.getAddress());
//            existingEmployee.setPhoneno(employee.getPhoneno());

            return employeeRepository.save(existingEmployee);
        }
        else
            return new Employee();
    }

    @Override
    public String deleteEmployee(int id) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "id deleted : "+ id;
        }
        else{
            return "id not found : " + id;
        }
    }

}





