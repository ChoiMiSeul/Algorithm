package level1;

public class XSpaceNNum {
	/**
	 * 프로그래머스 Level 1 x만큼 간격이 있는 n개의 숫자
	 * https://programmers.co.kr/learn/courses/30/lessons/12954
	 * 점수 : +6
	 * 날짜 : 210329
	 */
	public static long[] solution(long x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x + (x * i);
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(2,5));
	}
}
