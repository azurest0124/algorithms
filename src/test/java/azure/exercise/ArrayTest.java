package azure.exercise;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Array intArr = new Array(arr);
		int[] reversedArr = intArr.reverse();
		for(int i = 0;i<reversedArr.length;i++) {
			System.out.print( reversedArr[i] + " ");
		}
	}
}
