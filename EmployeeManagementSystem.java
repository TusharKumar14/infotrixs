package com.myproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EmployeeManagementSystem {
	private List<Employee>employees;
	
	public EmployeeManagementSystem() {
		this.employees = new ArrayList<>();
	}
	
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	
	public void updateEmployee(int employeeId,Employee updatedEmployee) {
		for(int i = 0; i < employees.size();i++) {
			Employee employee = employees.get(i);
			if(employee.getId() == employeeId) {
				employees.set(i,updatedEmployee);
				return;
			}	
			
		}
		System.out.println("Employee with ID " + employeeId + " not found.");
	}
	
	
	public void removeEmployee(int employeeId) {
		Iterator<Employee>iterator = employees.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.getId() == employeeId) {
				iterator.remove();
				return;
			}	
		}
		System.out.println("Employee with ID " + employeeId + " not found.");
	}
	
	
	public Employee findEmployee(int employeeId) {
		for(Employee employee : employees) {
			if(employee.getId() == employeeId)
				return employee;
		}
		return null;
	}
	
	
	public void displayAllEmployees() {
		for(Employee employee : employees)
			System.out.println(employee);
	}

}




































