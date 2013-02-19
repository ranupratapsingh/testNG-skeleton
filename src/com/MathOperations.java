package com;

/**
 * Created with IntelliJ IDEA.
 * User: R.P. Singh
 * Date: 19/2/13
 * Time: 2:09 PM
 */
public class MathOperations{
	//addition operation
	public int add(int x, int y){
		return x+y;
	}
	//subtraction operation
	public int subtract(int x, int y){
		return x-y;
	}
	//multiplication operation
	public int multiply(int x, int y){
		return x*y;
	}
	//division operation
	public int divide(int x, int y){
		if(y!=0)
			return x/y;
		else
			throw new IllegalArgumentException("Argument 'divisor' is 0");
	}

}
