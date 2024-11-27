package com.qa.tryOut;

public class EmployeeMain {
	public static void main(String[] args) {
		/*
		 * Employee employee = new Employee(); employee.printName();
		 * employee.printName(1);
		 */
		
		NewEmployee newEmployee = new NewEmployee();
		newEmployee.printName();
		
		newEmployee.printEmpAdd();
	}

}
