package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	for(Integer i:list)
	{
		System.out.println(i);
		
	}

}
}
