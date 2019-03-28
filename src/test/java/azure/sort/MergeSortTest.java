package azure.sort;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void mergeSort() {
		int []arr = {1,13,5,21,13,22,2,7,3,8,9,10}; 
		MergeSort sort = new MergeSort();
		sort.mergeSort(arr);
		sort.printArr(arr);
	}
}
