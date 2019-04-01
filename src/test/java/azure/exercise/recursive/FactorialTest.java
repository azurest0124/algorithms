package azure.exercise.recursive;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		Factorial fac = new Factorial();
		fac.factorial(6); 
		System.out.println(fac.getAnswer());
	}
}
