package com.yash.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
public class TestEmployeeSort {


	public static void main(String[] args) {
		List coll = Util.getEmployees();
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose between 1 and 3 to sort by the field you want to");
		System.out.println ("1 - By ID  \n2-By Name \n3- By Age");
		System.out.println("Please imput your choice:");
		int choice = scan.nextInt();
		if (choice == 1)
			Collections.sort(coll, new EmpSortById()); // sort method
		else if (choice == 2)
			Collections.sort(coll, new EmpSortByName());
		else if (choice == 3)
			Collections.sort(coll, new EmpSortByAge());
		else
			System.out.println("Please enter a number between 1 and 3");
		System.out.println("EmpId\tName\tAge");
		System.out.println("-------------------------------------");
		for(Iterator iter =  coll.iterator();iter.hasNext();)
		{
			Employee element = (Employee)iter.next();
			
			System.out.println(element.getEmpId()+"\t" + element.getName()+"\t"
					             + element.getAge());
	
		}
	

	
}

}