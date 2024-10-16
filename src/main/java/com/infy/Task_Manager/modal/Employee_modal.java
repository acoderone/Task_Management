package com.infy.Task_Manager.modal;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee_modal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId; // Changed to camelCase

    private String employeeName; // Changed to camelCase

    @OneToMany(mappedBy = "assigned_Employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task_Modal> tasks = new ArrayList<>(); // Changed to camelCase
   @ManyToOne
   @JoinColumn(name = "manager_id")
    private Manager_modal Manager;

    private Boolean isManager; // Changed to Boolean

    @Column(name = "department") // Added @Column annotation
    private String department;

    public Employee_modal() {
    }

    public Employee_modal(String employeeName, Boolean isManager, String department) {
        this.employeeName = employeeName;
        this.isManager = isManager; // Ensure this matches the type
        this.department = department;
    }

    public long getEmployeeId() { // Changed method name to camelCase
        return employeeId;
    }

    public String getEmployeeName() { // Changed method name to camelCase
        return employeeName;
    }

    public void setEmployeeName(String employeeName) { // Changed method name to camelCase
        this.employeeName = employeeName;
    }

    public Boolean getIsManager() { // Changed to Boolean and camelCase
        return isManager;
    }

    public void setIsManager(Boolean isManager) { // Changed to camelCase
        this.isManager = isManager;
    }

    public List<Task_Modal> getTasks() {
        return tasks; // Changed to camelCase
    }

    public void setTasks(List<Task_Modal> tasks) {
        this.tasks = tasks; // Changed to camelCase
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
