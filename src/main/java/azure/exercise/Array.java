package azure.exercise;

/**
 * 
 * Array에 대한 고민을 진행해 보자. 
 * 
 * 심플하게 int array에 대해서만 생각해 보기로. 
 * 1. 배열의 reverse
 * 2. 특정 값 삭제
 * 3. 특정 값 추가 
 * 	  - 인덱스 값 정해준 후 그 위치에 추가
 * 	  - 맨 마지막에 값 추가
 * 
 * @author azure
 *
 */
public class Array {

	int [] arr; 
	
	Array(int[] arr){
		this.arr = arr; 
	}
	public int [] reverse() {
		int[] reversedArr = new int[this.arr.length];
		for(int i = 0;i<this.arr.length;i++) {
			reversedArr[arr.length-1-i] = this.arr[i]; 
		}
		return reversedArr; 
	}
}
