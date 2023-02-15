package com.yash.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import java.util.Iterator;
import java.util.LinkedList;



public class HelloWorld {

	public static void main(String[] args) {
       
	Employee e1 = new Employee(1, "Prasanna"); 
	Employee e2 = new Employee(2, "Sneha"); 
	Employee e3 = new Employee(3, "Manasa"); 
	Employee e4 = new Employee(4, "Sharad"); 
	Employee e5 = new Employee(5, "Swathi"); 
	String s = "Yash";
	
	
	HashSet <Employee>employees = new HashSet<>();
	
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	for (Employee e : employees)   
		
		{System.out.println(e.getEmployeeName());

		}


    for (Iterator<Employee> it = employees.iterator(); it.hasNext(); )  { 
    	System.out.println(it.next().getEmployeeName());
          }
	
	HashMap<Integer, Employee> empMap = new HashMap<>();
	empMap.put(1, e1);
	System.out.println(empMap.get(1));
	
	
	
	}



}
