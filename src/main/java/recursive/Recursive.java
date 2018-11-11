package recursive;

public class Recursive {
	
	/**
	 * n >= 3
	 * n = 5 : 5번째 ?��?��
	 * n = 9 : 9번째 ?��?��
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {
		if ( n == 1 || n == 2 ) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	/**
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		
		if ( n == 0 || n == 1) return 1;
		else return n * factorial( n - 1 );
	}
}
