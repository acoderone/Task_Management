package com.infy.Task_Manager.modal;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task_Modal {


    @Id
    private Long Id;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Task_Status status;
    @ManyToOne
    @JoinColumn(name = "assigned_Employee_Id")
    private Employee_modal assigned_Employee;
    private Date due_date;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task_Status getStatus() {
        return status;
    }

    public void setStatus(Task_Status status) {
        this.status = status;
    }

    public Employee_modal getAssigned_Employee() {
        return assigned_Employee;
    }

    public void setAssigned_Employee(Employee_modal assigned_Employee) {
        this.assigned_Employee = assigned_Employee;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Task_Modal(Long id, String title, String description, Task_Status status, Employee_modal assigned_Employee, Date due_date) {
        Id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.assigned_Employee = assigned_Employee;
        this.due_date = due_date;
    }
}
