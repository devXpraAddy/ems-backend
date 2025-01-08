package com.aditya.ems.mapper;

import com.aditya.ems.dto.EmployeeDto;
import com.aditya.ems.entity.Employee;

// this class is used to map the data between the entity and the dto
public class EmployeeMapper {
    // this method is used to map the data from the entity to the dto
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    // this method is used to map the data from the dto to the entity
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
