package level2;

import java.util.Arrays;

public class JadenCase {
	/**
	 * 프로그래머스 Level2 JadenCase 만들기
	 * https://programmers.co.kr/learn/courses/30/lessons/12951
	 * 점수 : +8
	 * 날짜 : 210621
	 */
	public static String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        
        for(int i=0; i<arr.length; i++) {
        	if(i==0 || arr[i-1].equals(" ")) {
        		arr[i] = arr[i].toUpperCase();
        	}
        }
        
        return String.join("", arr); 
    }
	
	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
	}
}
