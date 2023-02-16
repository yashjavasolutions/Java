package com.yash.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class HelloWorld {

	public static void main(String[] args) {
       
	Employee e1 = new Employee(1, "Prasanna"); 
	Employee e2 = new Employee(2, "Sneha"); 
	Employee e3 = new Employee(3, "Manasa"); 
	Employee e4 = new Employee(4, "Sharad"); 
	Employee e5 = new Employee(5, "Swathi"); 
	//String s = "Yash";
	
	
	HashSet <Employee>employees = new HashSet<>();
	
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);/*
	for (Employee e : employees)   
		
		{System.out.println(e.getEmployeeName());

		}


    for (Iterator<Employee> it = employees.iterator(); it.hasNext(); )  { 
    	System.out.println(it.next().getEmployeeName());
          }*/
	
	employees.stream().filter(s->s.getEmployeeName().startsWith("S")).forEach(e->System.out.println(e.getEmployeeName()));
   /*
    
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

   
    

    
    int sum = numbers.parallelStream().reduce(0, (element1,element2)->element1+element2);
    
    System.out.println(sum);
    
    
    /*
    
    
    List<String> words = Arrays.asList("Java","SQL","Angular");
    
    List<String> result = words.parallelStream().filter(s ->s.startsWith("S")).collect(Collectors.toList());
    
    System.out.println(result);
    
    
    
    
    List<Integer> square = numbers.parallelStream().map(x->x*x).collect(Collectors.toList());
    System.out.println(square);
    
    */
	
    

	
	
	}



}
