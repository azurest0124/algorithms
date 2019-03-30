package azure.exercise;

import org.junit.Test;

import azure.exercise.GCD;

public class GCDTest {

	@Test
	public void test() {
		GCD gcd = new GCD(30, 47); 
		System.out.println(gcd.getAnswer()); 
	}
}
