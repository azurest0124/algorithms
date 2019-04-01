package azure.exercise;

/**
 * 
 * 정렬이 되어 있는 배열에서 특정 값의 인덱스를 찾는다 (정렬은 오름차순으로 되어 있어야 함)
 * @author azure
 *
 */
public class BinarySearch {

	private int index = -1; 
	
	BinarySearch () {}
	
	public void searchIndex(int[] arr, int start, int end, int searchValue) {
		
		int mid = (start + end)/2;
		System.out.println("mid :: "+ mid);
		if(arr[mid] == searchValue) {
			this.index = mid; 
			return ;
		}
		if(start == end) {
			System.out.println("찾는 값이 없음");
			return; 
		}
		if(arr[mid] < searchValue) {
			System.out.println("right arr");
			searchIndex(arr, mid + 1, end, searchValue); 
		} else {
			System.out.println("left arr");
			searchIndex(arr, 0, mid-1, searchValue); 
		}
	}
	
	public int getAnswer() {
		return this.index;
	}
}
