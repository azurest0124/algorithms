package sort;

public class CompareSort extends BaseSort {
	
	/*
	 * 1. 입력 배열의 i번째 요소와 i+1번째 요소를 비교한다. 
	 * 2. i번째 요소가 i+1번째 요소보다 클 경우 두 요소의 위치를 바꾼다.
	 * 3. 배열이 정렬될 때까지 반복한다.
	 * 시간복잡도 : O(n^2) - 2 loop
	 * 공간복잡도 : O(1)     - temp
	 */
	public static int[] bubble(int array[] ) {
		boolean isSwapRun = true;
		while( isSwapRun ) { // 3. 배열이 정렬될 때까지 반복한다.
			isSwapRun = false;
			for( int i=0; i < array.length-1; i++ ) {
				if ( array[i] > array[i+1] ) { // 1. 입력 배열의 i번째 요소와 i+1번째 요소를 비교한다.
					isSwapRun = true;
					// 2. i번째 요소가 i+1번째 요소보다 클 경우 두 요소의 위치를 바꾼다.
					swap( array, i, i+1);
				}
				System.out.println(arrayStatus(array));
			}
		}
		return array;
	}
	
	/*
	 * 1. 배열에서 최소값을 찾는다. loop
	 * 1-1 현재 위치를 최소값으로 설정한다.
	 * 1-2 다음 위치부터 마지막위치 검색한다.
	 * 1-3 최소값을 찾으면 최소값 위치로 설정한다. 
	 * 2. 최소값 위치를 현재 위치의 값과 교환한다.
	 * 3. 배열이 정렬될 때까지 반복한다. loop
	 * 시간 복잡도 : O(n^2) - 2 loop
	 * 공간 복잡도 : O(1)     - temp, min 
	 */
	public static int[] selection(int array[] ) {
		
		int minIndex;
		for(int i=0; i < array.length -1;i++) { // 3. 배열이 정렬될 때까지 반복한다.
			minIndex = i; //  1-1 현재 위치를 최소값으로 설정한다.				
			for( int j=i + 1; j < array.length; j++) { // 1-2 다음 위치부터 마지막위치 검색한다.
				if ( array[j] < array[minIndex]) { // 1-3 최소값을 찾으면 최소값 위치로 설정한다. 
					minIndex = j;
				}						
			}
			// 2. 최소값 위치를 현재 위치의 값과 교환한다.
			swap( array, minIndex, i);
			System.out.println(arrayStatus(array));
		}
		return array;
	}
	
	/*
	 * 정렬되어 있는 리스트에 삽입할 값을 순서에 맞게 삽입한다.
	 * 
	 *  1. 삽입값을 기준으로 정렬된 값과 정렬되지 않은 값으로 구분된다. 삽입 값은 정렬되지 않은 가장 작은 순번이 된다.
	 *  1.1 포지션은 항상 정렬된 값의 마지막 순번을 갈킨다.
	 *  
	 *  2. 삽입 값의 최초 위치는 0 다음인 1이고, 이 정렬되지 않은 삽입값을 정렬된 값들과 비교하면서 정렬된 값들 사이에 집어 넣는다.
	 *  2.1 정렬된 값의 마지막 순번부터 삽입값이 더 작은지 비교한다.(혹은 큰지)
	 *  2.2 정렬된 값이 삽입 값보다 더 크면 정렬된 값들을 하나씩 뒤로 미룬다. insertValue가 빈공간 하나를 차지해서 괜찮다.
	 *  2.3 정렬된 이전 위치로 이동한다.
	 *  2.4 정렬된 순서 사이에 삽입 값을 넣는다.
	 *  
	 *  3. 모든 배열이 정렬이 될때까지 반복한다.
	 *  
	 *  http://blog.naver.com/madplay/220229003111
	 */
	public static int[] insertion(int array[] ) {
		int keyValue;
		int pos;
		
		// 3. 모든 배열이 정렬이 될때까지 반복한다.
		for( int i=1; i < array.length; i++) {
			keyValue = array[i]; // 1. 삽입값을 기준으로 정렬된 값과 정렬되지 않은 값으로 구분된다. 삽입 값은 정렬되지 않은 가장 작은 순번이 된다.
			pos = i-1; // 1.1 포지션은 항상 정렬된 값의 마지막 순번을 갈킨다.

			// 2. 삽입 값의 최초 위치는 0 다음인 1이고, 이 정렬되지 않은 삽입값을 정렬된 값들과 비교하면서 정렬된 값들 사이에 집어 넣는다.
			while ( (pos >=0) && (array[pos] > keyValue ) ) { // 2.1 정렬된 값의 마지막 순번부터 삽입값이 더 작은지 비교한다.(혹은 큰지)
				array[pos+1] = array[pos]; // 2.2 정렬된 값이 삽입 값보다 더 크면 정렬된 값들을 하나씩 뒤로 미룬다. insertValue가 빈공간 하나를 차지해서 괜찮다.
				pos--;//2.3 정렬된 이전 위치로 이동한다.
			}
			array[pos +1] = keyValue; // 2.4 정렬된 순서 사이에 삽입 값을 넣는다.
		}
		
		return array;
	}
	
	public static int[] insertion(int array[], int first, int gap ) {
		int keyValue;
		int pos;
		for( int i=first+gap; i < array.length; i= i + gap) {
			keyValue = array[i]; 

			for(pos = i -gap; pos >= first && array[pos] > keyValue; pos =pos-gap ) {
				array[pos + gap] = array[pos];
			}
			array[pos + gap] = keyValue;
		}
		
		return array;
	}
	
	/*
	 * 삽입 알고리즘은 2.1, 2.2 지점에서 정렬이 되지 않은경우 하나씩 옮기는 과정에 큰 오버헤드가 있다.
	 * 그래서 어느 정도 정렬이 된 상태의 배열을 만든 뒤(gap을 둬서)들어서 옮기는 과정 발생을 줄인다.
	 * 그렇게 되면 어느정도 정렬이 되어있기 때문에 큰 성능향상이 있게된다. 
	 * 여러 개의 부분 리스트(1,3,5gap을 갖는)를 만들고, 각 부분 리스트를 삽입 정렬을 이용해서 정렬 하게 된다.
	 */
	public static int[] shell(int array[]) {
		
		for(int gap = array.length/2; gap > 0; gap = gap/2) {
			for(int i = 0; i < gap; i++) {
				insertion( array, i, gap);
				System.out.println(arrayStatus(array));
			}
		}
		return array;
	}
}
