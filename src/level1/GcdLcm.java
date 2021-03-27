
package level1;

public class GcdLcm {
	/**
	 * 프로그래머스 Level 1 최대공약수와 최소공배수
	 * https://programmers.co.kr/learn/courses/30/lessons/12940
	 * 점수 : +3
	 * 날짜 : 210327
	 * 사용한 수학 : 유클리드 호제법(아래와 같이 나머지 연산을 반복하면 gcd를 구할 수 있음)
	 */
	public static int solution(int n, int m) {
		int div = 0;
		int n1 = n;
		int m1 = m;
		int[] answer = new int[2];
		while (m % n != 0) {
			div = m % n;
			m = n;
			n = div;
		}
		answer[0]=n;
		answer[1]=(n1*m1)/n;
		
		return n;
	}
}
