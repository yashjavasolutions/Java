package com.yash.demo;

public  class Employee {

    private int employeeId ;
	 private  String employeeName;
	 

	
	
	public Employee(int employeeId, String employeeName) {
	
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public Employee(String employeeName) {
		
	
		this.employeeName = employeeName;
	}
	
	
	public Employee() {
		
	}
	

	public  void hello() {
		System.out.println("Hello");
		
	}
	
	public void hello(String greeting) {
		System.out.println(greeting);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Yash";
	}
	

}