package azure.sort;

/**
 * 
 * SelectionSort의 key : Minimum Value, Minimum Index
 * '난 한 놈만 조진다!' 이런 마인드로 접근?? ㅋㅋㅋ 
 * 
 * 최소 값 찾기!
 * 1. arr[0] 값을 최소값이라 가정(minVal = arr[0])
 * 2. arr[0]을 자기 자신을 제와한 모든 값들과 비교하며 실제 최소 값의 index를 업데이트
 * 3. 최소 값의 index가 0이 아니면 업데이트 된 최소 값의 index와 arr[0]의 값을 교환
 * ===> arr[0]에는 arr의 최소 값이 위치
 * 
 * 두 번째로 작은 값을 찾기!
 * arr[0]에는 arr의 최소 값이 들어갔기 때문에 arr[0]은 제낀다. (배열은 arr[1]에서 시작한다 가정)
 * 1. arr[1] 값을 최소값이라 가정(minVal = arr[1])
 * 2. arr[1]을 자기 자신과 arr[0]을 제와한 모든 값들과 비교하며 최소 값의 index를 업데이트
 * 3. 최소 값의 index가 1이 아니면 업데이트 된 최소 값의 index와 arr[1]의 값을 교환
 * ===> arr[1]에는 arr의 두 번째로 작은 값이 위치
 * 
 * @author azure
 *
 */
public class SelectionSort {

	public int[] selSort (int []arr) {
		
		int minIdx=0, size = arr.length; 
		for(int i = 0; i<size-1; i++) {
			minIdx = i;
			for(int j = i+1; j<size; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j; 
				}	
			}
			if(i != minIdx) swap(arr, i, minIdx);
		}
		return arr;
	}
	
	private int[] swap(int[] arr, int idx1, int idx2 ) {
		int tmp = arr[idx1]; 
		arr[idx1]= arr[idx2];
		arr[idx2] = tmp;
		return arr; 
	}
	
	public void printArr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
