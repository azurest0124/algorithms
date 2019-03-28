package azure.sort;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void selectionSort() {
		
		int []arr = {1,13,5,21,13,22,2,7,3,8,9,10}; 
		SelectionSort selSort = new SelectionSort();
		selSort.selSort(arr); 
		selSort.printArr(arr);
	}
}
