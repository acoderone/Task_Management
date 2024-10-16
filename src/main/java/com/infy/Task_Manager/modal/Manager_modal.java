package com.infy.Task_Manager.modal;

import java.util.List;

public class Manager_modal extends Employee_modal{
    private int TeamSize;
    private List<Employee_modal> employees;
    private List<Task_Modal>tasks;

    public Manager_modal(int teamSize, List<Employee_modal> employees, List<Task_Modal> tasks) {
        TeamSize = teamSize;
        this.employees = employees;
        this.tasks = tasks;
    }

    public Manager_modal(String employeeName, Boolean isManager, String department, int teamSize, List<Employee_modal> employees, List<Task_Modal> tasks) {
        super(employeeName, isManager, department);
        TeamSize = teamSize;
        this.employees = employees;
        this.tasks = tasks;
    }

    public int getTeamSize() {
        return TeamSize;
    }

    public void setTeamSize(int teamSize) {
        TeamSize = teamSize;
    }

    public List<Employee_modal> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee_modal> employees) {
        this.employees = employees;
    }

    @Override
    public List<Task_Modal> getTasks() {
        return tasks;
    }

    @Override
    public void setTasks(List<Task_Modal> tasks) {
        this.tasks = tasks;
    }
}
