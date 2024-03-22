package com.service;


import java.util.Collections;
import java.util.List;

public class ArithmeticService {

	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	public int sumOfArray(int array[])
    {
    	int sum=0;
    	for(int i:array)
    	{
    		sum+=i;
    	}
    	return sum;
    }
	public List<Integer>sortList(List<Integer> list,String direction)
	
	{
	if(direction.equalsIgnoreCase("ASC"))
		Collections.sort(list);
	if(direction.equalsIgnoreCase("DESC"))
		Collections.reverse(list);
	return list;
	}
	
}
