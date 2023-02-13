package com.yacineDev.demo.Services;

import com.yacineDev.demo.Repositories.EmployeeRepo;
import com.yacineDev.demo.exception.UserNotFoundException;
import com.yacineDev.demo.module.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAllEmployees() ;
    }
    public List<Employee> findAllEmployeesOrderedByName(){
        return employeeRepo.findAllEmployeesOrderedByName();
    }
    public List<Employee> findAllEmployeesOrderedByNameDESC(){
        return employeeRepo.findAllEmployeesOrderedByNameDESC();
    }
    public List<Employee> findAllEmployeesOrderedByEmail(){
        return employeeRepo.findAllEmployeesOrderedByEmail();
    }
    public List<Employee> findAllEmployeesOrderedByEmailDESC(){
        return employeeRepo.findAllEmployeesOrderedByEmailDESC();
    }
    public List<Employee> findEmployeesByInput(String input){
        return employeeRepo.findEmployeesByInput(input);
    }

    public  Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }

    public String getEmployeeRole(BigInteger id){
        return employeeRepo.getEmployeeRole(id);
    }
}
