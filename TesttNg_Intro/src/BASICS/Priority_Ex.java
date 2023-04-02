package BASICS;

import org.testng.annotations.Test;

public class Priority_Ex {
	
	@Test(priority=1)
	public void t1() {
		System.out.println("t1");
	}
	@Test(priority=4)
	public void access() {
		
		System.out.println("acess");
	}
	@Test(priority=2)
	public void method1() {
		System.out.println("method1");
	}
	@Test(priority=3)
	public void blackout() {
		System.out.println("blackout");
	}
}
