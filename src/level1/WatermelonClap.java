package level1;

public class WatermelonClap {
	/**
	 * 프로그래머스 Level 1 수박수박수박수
	 * https://programmers.co.kr/learn/courses/30/lessons/12922 
	 * 점수 : +1 
	 * 날짜 : 210324
	 */
	public static String solution(int n) {
		String answer = "";
		for (int i = 0; i < n / 2; i++) {
			answer += "수박";
		}
		if (n % 2 != 0) {
			answer += "수";
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
}
