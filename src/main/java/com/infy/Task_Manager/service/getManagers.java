package com.infy.Task_Manager.service;

import com.infy.Task_Manager.modal.Employee_modal;
import com.infy.Task_Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getManagers {
    @Autowired
EmployeeRepository employeeRepository;

    public getManagers(EmployeeRepository employeeRepository){
       this.employeeRepository=employeeRepository;
    }

    public List<String> getAllManagers() {
        return employeeRepository.findByIsManagerTrue().stream()
                .map(Employee_modal::getEmployeeName)  // Use the correct getter method reference
                .toList();
    }


}
