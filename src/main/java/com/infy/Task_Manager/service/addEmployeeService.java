package com.infy.Task_Manager.service;

import com.infy.Task_Manager.modal.Employee_modal;
import com.infy.Task_Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class addEmployeeService {
   @Autowired
 EmployeeRepository employeeRepository;

    public void addEmployee(Employee_modal employee){

      employeeRepository.save(employee);
    }
}
