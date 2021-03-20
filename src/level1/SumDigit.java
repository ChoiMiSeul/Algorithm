package level1;

public class SumDigit {
	/**
	 * 프로그래머스 Level 1 자릿수 더하기
	 * https://programmers.co.kr/learn/courses/30/lessons/12931
	 * 점수 : +1
	 * 날짜 : 210320
	 */
	public int solution(int n) {
		int answer=0;
		while(n>0) {
			answer+=n%10;
			n/=10;
		}
		return answer;
	}
}
