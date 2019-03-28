package azure.sort;
/**
 * 
 * MergeSort의 keyword : 재귀함수 & (divide and conquer) 
 * 
 * @author azure
 *
 */
public class MergeSort {
	public static void main(String[] args) {

		int[] arr = {1,6,3,12,5,9,2,1};
		mergeSort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void mergeSort(int [] arr) {
		int length = arr.length; 
		if(length == 1) return; 
		int mid = length/2;
		
		int[] leftArr = makeArr(arr, 0, mid-1) ; 
		int[] rightArr = makeArr(arr, mid, length-1); 
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(arr, leftArr, rightArr); 
		
	}
	
	private static int[] merge(int[]arr, int[] leftArr, int[]rightArr) {
		int leftSize = leftArr.length;
		int rightSize = rightArr.length; 
		int i=0 , j = 0, x = 0;
		
		while(i<leftSize && j<rightSize) {
			if(leftArr[i]<rightArr[j]) {
				arr[x++] = leftArr[i++]; 
			} else {
				arr[x++] = rightArr[j++]; 
			}
		}
		
		while(i<leftSize) {
			arr[x++] = leftArr[i++]; 
		}
		
		while(j<rightSize) {
			arr[x++] = rightArr[j++]; 
		}
		
		return arr; 
	}
	
	private static int[] makeArr(int[]arr, int startIdx, int endIdx) {
		int length = endIdx - startIdx + 1; 
		int[] newArr = new int[length]; 
		for(int i = 0;i<length;i++) {
			newArr[i] = arr[startIdx+i];
		}
		return newArr; 
	}
}
