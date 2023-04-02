package BASICS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Ex {
	
	@Test
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("method 2");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("*****************after method********************");
	}

	@BeforeMethod
	public void beformethod() {
		System.out.println("********************before method******");
	}
}
