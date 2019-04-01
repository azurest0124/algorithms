package azure.exercise;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		BinarySearch search = new BinarySearch(); 
		search.searchIndex(arr, 0, 11, 3);
		System.out.println(search.getAnswer());
	}
}
