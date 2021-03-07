package level1;

public class CountPny {
	/**
	 * 프로그래머스 Level 1 문자열 내 P와 Y의 개수
	 * https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
	 * 점수 : 1005
	 */

	public static boolean solution(String s) {
		// 1. P,Y 개수가 같으면 트루 아니면 펄스
		// 2. p,y가 하나도 없으면 트루
		// 3. 대소문자 구분 x - 로우, 어퍼 클래스
		s = s.toLowerCase();
		int numP = 0;
		int numY = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				numP++;
			} else if (s.charAt(i) == 'y') {
				numY++;
			}
		}

		if (numP == 0 && numY == 0) {
			return true;
		} else if (numP == numY) {
			return true;
		} 
		return false;
	}

	public static void main(String[] args) {
		System.out.println(solution("ofof"));

	}
}