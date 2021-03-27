package level1;

public class DivisorSum {
	/**
	 * 프로그래머스 Level 1 약수의 합
	 * 
	 * 점수 : 
	 * 날짜 : 210327
	 */
	public static int solution(int n) {
		int answer = 0;
		int i = 1;
		while (i <= n / i) {
			if (n == 1)
				return 1;
			if (n % i == 0) {
				if(i==(n/i)) return answer+=i;
				answer += i + (n / i);
			}
			i++;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(25));
	}
}