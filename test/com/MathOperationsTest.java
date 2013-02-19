package com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: R.P. Singh
 * Date: 19/2/13
 * Time: 2:11 PM
 */
public class MathOperationsTest {
	public MathOperations mo;

	@BeforeClass
	public void setup(){
		mo = new MathOperations();
	}

	@Test(groups = {"mathOpTests"})
	public void testSum(){
		mo = new MathOperations();
		assert mo.add(4,5) == 9;
	}

	@Test(groups = {"mathOpTests"})
	public void testSubtract(){
		mo = new MathOperations();
		assert mo.subtract(5, 3) == 2;
	}

	@Test(groups = {"mathOpTests"})
	public void testMultiply(){
		mo = new MathOperations();
		assert mo.multiply(5, 3) == 15;
	}

	@Test(groups = {"mathOpTests"})
	public void testDivide(){
		mo = new MathOperations();
		assert mo.divide(5, 3) == 1;
	}

	@Test(groups = {"mathOpTests"})
	public void testDivideBy0(){
		mo = new MathOperations();
		try{
			mo.divide(5,0);	//should throw exception
			assert false;
		}catch (IllegalArgumentException e){
			assert true;
		}
	}
}
