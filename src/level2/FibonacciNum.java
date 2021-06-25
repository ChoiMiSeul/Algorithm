package level2;

public class FibonacciNum {
	/**
	 * 프로그래머스 Level2 피보나치 수
	 * https://programmers.co.kr/learn/courses/30/lessons/12945
	 * 점수 : +8
	 * 날짜 : 210625
	 */
	public static int solution(int n) {
		int num1 = 1;
		int num2 = 1;
		int fibo = 0;
		
		if(n<=2) return 1;
		else {
			for(int i=3; i<=n; i++) {
				fibo = (num1+num2) % 1234567;
				num1 = num2;
				num2 = fibo;
			}
			return fibo;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(solution(5));
	}
}
