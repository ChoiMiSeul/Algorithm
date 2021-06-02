package level2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class PhoneNumList {
	/**
	 * 프로그래머스 Level 2 전화번호 목록
	 * https://programmers.co.kr/learn/courses/30/lessons/42577
	 * 점수 : +6
	 * 날짜 : 210507
	 */
	public static boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length; i++) {
        	for(int j=i+1; j<phone_book.length; j++) {
        		if(phone_book[j].startsWith(phone_book[i])) {
        			return false;
        		}break;
        	}
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		String[] a = {"119", "97674223", "1195524421"}; //"119", "97674223", "1195524421"
		System.out.println(solution(a));
	}
}
