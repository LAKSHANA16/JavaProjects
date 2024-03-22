package com.controller;

import com.service.ArithmeticService;

public class ArithmeticController {
public static void main(String args[])
{
	ArithmeticService arithmeticService =new ArithmeticService ();
	int num1=49;
	int num2=87;
	int ans= arithmeticService.sum(num1,num2);
	System.out.println("SUM:"+ans);
}
}
