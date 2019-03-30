package azure.exercise;

/**
 * 궁금했던 유클리드 호제(互除)법
 * 
 * A, B의 최대공약수 (greatest common divisor)를 구하는 방법. A, B의 최대 공약수는, B와 A를 B로 나눈 나머지
 * R의 최대 공약수와 같다. 즉 gcd(A, B) == gcd(B, R)
 * 
 * 
 * <<증명>> A와 B의 최대공약수를 G라 가정하면 A = aG, B = bG라 표시. (A>B)인 경우 A = Bx + R로 표시
 * 가능(x는 몫, R은 나머지). aG = bGx + R 그렇다면 R = aG-bGx R = (a-bx)G 그러므로 R도 최대공약수 G를
 * 공유한다 표현할 수 있다!
 * 
 * 그럼 나머지는 상상이 되쥬????
 * 
 * @author azure
 *
 */
public class GCD {

	private int answer = 0;

	GCD(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		this.getGcd(a, b);
	}

	private void getGcd(int a, int b) {

		int r = a % b;
		if (r == 0) {
			answer = b;
			return;
		}
		else {
			getGcd(b, r);
		}
	}

	public int getAnswer() {
		return this.answer;
	}
}
