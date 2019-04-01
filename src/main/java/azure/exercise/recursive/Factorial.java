package azure.exercise.recursive;

public class Factorial {
	private int answer = 1;
	Factorial(){}
	
	public int factorial(int n) {
		 
		if(n > 1) {
			this.answer = n*factorial(n-1); 
			return this.answer; 
		} else return n; 
	}
	
	public int getAnswer() {
		return this.answer; 
	}
}
