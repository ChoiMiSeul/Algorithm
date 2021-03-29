package level1;

public class MediumString {
	/**
	 * 프로그래머스 Level 1 가운데 글자 가져오기
	 * https://programmers.co.kr/learn/courses/30/lessons/12903 
	 * 점수 : +1
	 * 날짜 : 210329
	 */
	public static String solution(String s) {
		// char answer='\u0000';
		char[] answer = new char[s.length() % 2 != 0 ? 1 : 2];
		if (s.length() % 2 == 0) {
			answer[0] = s.charAt(s.length() / 2 - 1);
			answer[1] = s.charAt(s.length() / 2);
		} else {
			answer[0] = s.charAt(s.length() / 2);
		}
		return String.valueOf(answer);
	}

	public static void main(String[] args) {
		System.out.println(solution("abcd"));
	}
}
