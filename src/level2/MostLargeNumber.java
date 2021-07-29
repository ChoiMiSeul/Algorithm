package level2;

import java.util.Arrays;
import java.util.Comparator;

public class MostLargeNumber {
	/**
	 * 프로그래머스 Level2 가장 큰 수
	 * https://programmers.co.kr/learn/courses/30/lessons/42746
	 * 점수 : +9
	 * 날짜 : 210729
	 */
	public static String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
        	@Override
        	public int compare(String a, String b) {
        		return (b+a).compareTo(a+b); //a, b가 스트링이기 때문에 a에 b를 더하는 거랑 b에 a를 더하는 건 다름
        	}
		});
        
        if(str[0].equals("0")) return "0";
        
        for(String s : str) {
        	answer += s;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] a = {3, 30, 34, 5, 9};
		System.out.println(solution(a));
	}
}
