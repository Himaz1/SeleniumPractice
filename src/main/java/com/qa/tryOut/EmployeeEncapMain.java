package com.qa.tryOut;

public class EmployeeEncapMain {
	public static void main(String[] args) {
		EmplyeeEncap emplyeeEncap = new EmplyeeEncap();
		System.out.println(emplyeeEncap.getEmpName());
		System.out.println(emplyeeEncap.getEmpId());
		
		emplyeeEncap.setEmpId(1987);
		emplyeeEncap.setEmpName("Himaz Ahamed");
		
		System.out.println(emplyeeEncap.getEmpId());
		System.out.println(emplyeeEncap.getEmpName());
	}

}
