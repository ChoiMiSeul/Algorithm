package level1;

import java.util.Arrays;

public class HidePhoneNumber {
	/**
	 * 프로그래머스 Level 1 핸드폰 번호 가리기
	 * https://programmers.co.kr/learn/courses/30/lessons/12948
	 * 점수 : +1
	 * 날짜 : 210318 00:00~00:30
	 */
	public static String solution(String phone_number) {
		String[] arr = phone_number.split("");
		String answer="";
		for(int i=0;i<arr.length-4;i++) {
			arr[i]="*";
			answer+=arr[i];
		}
		for(int i=arr.length-4;i<arr.length;i++)	answer+=arr[i];
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("01026688185"));
	}
}
