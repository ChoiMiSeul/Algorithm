package level1;

public class ChangeStringToInt {
	/**
	 * 프로그래머스 Level 1 문자열을 정수로 바꾸기
	 * https://programmers.co.kr/learn/courses/30/lessons/12925
	 * 점수 : +1
	 * 날짜 : 210401
	 */
	public static int solution(String s) {
		//s를 숫자로 반환
		//부호로 시작 가능
		//0으로 시작X
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		System.out.println(solution("+1234"));
	}
}
