package level1;

public class InnerProduct {
	/**
	 * 프로그래머스 Level 1 내적
	 * https://programmers.co.kr/learn/courses/30/lessons/70128
	 * 점수 : +1
	 * 날짜 : 210327
	 */
	public static int solution(int[] a, int[] b) {
		int answer=0;
		for(int i=0;i<a.length;i++) {
			answer+=a[i]*b[i];
		}
		return answer;
	}

	public static void main(String[] args) {
	}
}
