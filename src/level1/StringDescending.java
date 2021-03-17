package level1;

import java.util.Arrays;
import java.util.Collections;

public class StringDescending {
	/**
	 * 프로그래머스 Level 1 문자열 내림차순으로 배치하기
	 * https://programmers.co.kr/learn/courses/30/lessons/12917
	 * 점수 : +3
	 * 날짜 : 210316
	 */
	public String solution(String s) {
		//String answer="";
		String[]arr=s.split("");
		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));
		return String.join("", arr);
	}
}
