package com.velocity;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
public static void main(String[] args) {
	List<Integer> list=new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	System.out.println("working");
	for(Integer i:list)
	{
		System.out.println(i);
		
	}
}
}
