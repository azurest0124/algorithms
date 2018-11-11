package sort;

public class BaseSort {
	
	public static void printBeforeData(int[] input) {
		System.out.println( "BEFORE : " );
		System.out.println( arrayStatus(input) );
	}
	
	public static void printAfterData(int[] result) {
		System.out.println( "AFTERZ : " + arrayStatus(result) );
	}
	
	public static void swap(int array[], int indexA, int indexB ) {
		System.out.println("SWAP : " + indexA + ", " + indexB);
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	public static String arrayStatus(int[] input ) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i=0; i < input.length;i++) {
			sb.append(input[i]);
			if ( i != (input.length -1) ) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
