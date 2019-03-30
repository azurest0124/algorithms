package azure.exercise;

import org.junit.Test;

/**
 * 
 * 최소 공배수는 입력된 두 수를 곱한 다음 최대공약수로 나눠주면 됨.
 * @author azure
 *
 */
public class LCMTest {
	
	@Test
	public void test() {
		LCM lcm = new LCM(15, 40); 
		System.out.println(lcm.getAnswer());
	}
}
