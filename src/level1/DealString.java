package level1;

public class DealString {
	/**
	 * 프로그래머스 Level 1 문자열 다루기 기본
	 * https://programmers.co.kr/learn/courses/30/lessons/12918
	 * 점수 : +11
	 */
	public static boolean solution(String s) {
		//1. s의 길이는 4 or 6
		//2. 숫자로 구성 되어있으면 True, 아니면 False
		boolean answer=true;
		
		byte[] arr=s.getBytes();
		
		if(s.length()==4 || s.length()==6) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(arr[i]>=48 && arr[i]<=57) count++;
				else return false;
			}return true;
		}return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("134a"));
	}
}