package com.velocity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	List<Integer> list=new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	for(Integer i:list)
	{
		System.out.println(i);
		
	}
}
}
