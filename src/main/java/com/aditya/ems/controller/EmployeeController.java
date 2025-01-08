package com.aditya.ems.controller;

import com.aditya.ems.dto.EmployeeDto;
import com.aditya.ems.entity.Employee;
import com.aditya.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Build Add Employee REST API
    @PostMapping
    // @RequestBody extract the json from the request body(http) request and convert it to EmployeeDto object
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    // Build Get Employee REST API
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId)// @PathVariable extract the id from the url and bind to EmployeeId
    {
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    // Build Get All Employees REST API
    @GetMapping("/")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees()
    {
        List<EmployeeDto> employee = employeeService.getAllEmployees();
        return new ResponseEntity<>(employee , HttpStatus.OK);
    }

    // Build Update Employee REST API (put)
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody EmployeeDto updateEmployee)
    {
        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updateEmployee);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    // Build Delete Employee REST API

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId)
    {
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>("Employee deleted successfully",HttpStatus.OK);
        // or return ResponseEntity.ok("Employee deleted successfully");
        //
    }
}
