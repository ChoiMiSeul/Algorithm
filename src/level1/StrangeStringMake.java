package level1;

import java.util.Arrays;

public class StrangeStringMake {
	/**
	 * 프로그래머스 Level 1 이상한 문자 만들기
	 * https://programmers.co.kr/learn/courses/30/lessons/12930
	 * 점수 : +9
	 * 날짜 : 210330~210331
	 */
	public static String solution(String s) {
		String answer = "";
		String[] temp = s.split(""); // try hello world
		int idx=0;
		String space=" ";
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i].equals(space)) {
				idx=0;
			}else {
				if(idx%2==0) {
					idx++;
					temp[i]=temp[i].toUpperCase();
				}else {
					idx++;
					temp[i]=temp[i].toLowerCase();
				}
			}answer+=temp[i];
			System.out.println(answer);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("try hi world"));
	}
}