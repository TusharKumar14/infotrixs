package com.myproject;

public class Main {

	public static void main(String[] args) {
		EmployeeManagementSystem system = new EmployeeManagementSystem();
		system.addEmployee(new Employee(101,"Johnny",50000));
		system.addEmployee(new Employee(102,"Ronny",60000));
		system.addEmployee(new Employee(103,"Sunny",70000));
		
		
		
		System.out.println("Initial Employee list");
		system.displayAllEmployees();
		
		// Updating an employee
        Employee updatedEmployee = new Employee(102, "Jane Doe", 65000);
        system.updateEmployee(102, updatedEmployee);

        // Removing an employee
        system.removeEmployee(103);

        // Displaying employees after the update and removal
        System.out.println("\nEmployee list after updating and removing:");
        system.displayAllEmployees();

        // Searching for an employee
        int searchId = 101;
        Employee searchedEmployee = system.findEmployee(searchId);
        if (searchedEmployee != null) {
            System.out.println("\nEmployee with ID " + searchId + " found: " + searchedEmployee);
        } 
        else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }
		
		
		

	}

}
