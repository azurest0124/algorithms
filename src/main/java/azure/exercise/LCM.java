package azure.exercise;

public class LCM {

	private int answer ;
	
	public LCM(int a, int b){
		this.getLCM(a, b);
	}
	
	private void getLCM(int a, int b) {
		GCD gcd = new GCD(a, b); 
		this.answer = a*b/gcd.getAnswer(); 
	}
	
	public int getAnswer() {
		return this.answer; 
	}
}
