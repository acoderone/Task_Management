package com.infy.Task_Manager.controller;

import com.infy.Task_Manager.modal.Employee_modal;
import com.infy.Task_Manager.service.addEmployeeService;
import com.infy.Task_Manager.service.getManagers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private addEmployeeService addEmployeeService;
    @Autowired
    private getManagers getManagersService;
    @PostMapping("/add")
    public ResponseEntity<String> insertEmployee(@RequestBody Employee_modal employee){
        addEmployeeService.addEmployee(employee);
        return ResponseEntity.ok("Employee is added");
    }

    @GetMapping("/managers")
    public List<String> getManagers(){
        return getManagersService.getAllManagers();
    }


}
