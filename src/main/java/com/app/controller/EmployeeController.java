package com.app.controller;

import com.app.entity.Employee;
import com.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //    insert data into DB
    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

        return new ResponseEntity<Employee>(employeeService.createEmployee(employee), HttpStatus.CREATED);

    }

    @GetMapping("/getEmployeeDetailById/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id){

        return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee() , HttpStatus.OK);
    }

    @PutMapping("/updateEmployeeById/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.updateEmployee(id, employee), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id)
    {
        return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);
    }
}
