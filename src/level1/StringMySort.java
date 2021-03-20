package level1;

import java.util.Arrays;
import java.util.Comparator;

public class StringMySort{
	/**
	 * 프로그래머스 Level 1 문자열 내 마음대로 정렬하기
	 * https://programmers.co.kr/learn/courses/30/lessons/12915
	 * 점수 : +6
	 * 날짜 : 210318 23:00 ~ (19x) ~210320
	 */
	public String[] solution(String[] strings, int n) {
		//1. 인덱스 n을 기준으로  strings 오름차순 정렬
		//2. n이 같은 알파벳이면 해당 문자열이 사전순에서 앞선 순서대로 정렬
		Arrays.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String arg0, String arg1) {
				if(arg0.charAt(n)<arg1.charAt(n)) return -1;
				else if(arg0.charAt(n)>arg1.charAt(n)) return 1;
				else if(arg0.charAt(n)==arg1.charAt(n)) {
					return arg0.compareTo(arg1);
				}
				else return 0;
			}
		});
		
		return strings;
	}

}
