package com.yash.sort.comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class TestEmployeeSort {


	public static void main(String[] args) {
		List coll = Util.getEmployees();
		Collections.sort(coll); // sort method
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
