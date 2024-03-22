package com.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.service.ArithmeticService;

import junit.framework.Assert;

public class ArithmeticServiceTest {
	ArithmeticService arithmeticService=new ArithmeticService();
    @Test//have to annotate with test
	public void sumTest()//always mthd void
    {
    	int num1=49;
    	int num2=87;//Assert class in org.junit which has methods equals
    	Assert.assertEquals(136,arithmeticService.sum(num1, num2));
    	//expected output,actual output
    }
    @Test
    public void sumOfArray()
    {
    	int array[]= {5,2,6,8,0};
    	Assert.assertEquals(21,arithmeticService.sumOfArray(array));
    	/*int array1[]= {0,2,6,8,3};
    	Assert.assertEquals(21,arithmeticService.sumOfArray(array1));*/
    }
    @Test
    public void sortListTest() {
    	List<Integer>list=Arrays.asList(4,2,1,7,5);
    	String direction="ASC";
    	List<Integer>expectedlist=Arrays.asList(1,2,4,5,7);
        Assert.assertEquals(expectedlist,arithmeticService.sortList(list, direction));
    }
}
