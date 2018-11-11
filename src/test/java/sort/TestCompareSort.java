package sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sort.BaseSort;
import sort.CompareSort;

public class TestCompareSort {

	private int[] input;
	private int[] result;

	@Before
	public void setUp() throws Exception {
		input = new int[] {1,9,7,4,6,3,1,21,5,7,32,11};
		System.out.println("배열 길이 : " + input.length);
		result = null;
//		Sort.printBeforeData(input);
	}
	
	@After
	public void tearDown() throws Exception {
		BaseSort.printAfterData(result);
		System.out.println();
	}
	
	@Test
	public void testBubbbleSort() {
		System.out.println("Bubble");
		result = CompareSort.bubble(input);
	}
	
	@Test
	public void testSelectionSort() {
		System.out.println("Selection");
		result = CompareSort.selection(input);
	}
	
	@Test
	public void testInsertionSort() {
		System.out.println("Insertion");
		result = CompareSort.insertion(input, 1, 1);
	}
	
	@Test
	public void testShellSort() {
		System.out.println("Shell");
		result = CompareSort.shell(input);
	}
}
