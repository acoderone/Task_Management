package com.infy.Task_Manager.repository;

import com.infy.Task_Manager.modal.Employee_modal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee_modal,Long> {
    List<Employee_modal> findByIsManagerTrue();
}
