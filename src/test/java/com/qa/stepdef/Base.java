package com.qa.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Base {

	
	@Before
	public void method1()
	{
		System.out.println("Started");
	}
	
	@After	
	public void method2(Scenario s)
	{
		System.out.println(s.getStatus() + "Completed");
	}
	
	
	@BeforeStep
	public void method3()
	{
		System.out.println("Before Step started");
	}
	
	@AfterStep
	public void method4()
	{
		System.out.println("After step completed");
	}
	
}
