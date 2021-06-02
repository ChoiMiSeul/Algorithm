package level2;

import java.util.Arrays;

public class MaxValueMinValue {
	/**
	 * 프로그래머스 Level 2 최댓값과 최솟값
	 * https://programmers.co.kr/learn/courses/30/lessons/12939
	 * 점수 : +1
	 * 날짜 : 210515
	 */
	public static String solution(String s) {
		String[] stArr = s.split(" ");
		int[] numArr = Arrays.asList(stArr).stream().mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);
        
        return Integer.toString(numArr[0])+" "+Integer.toString(numArr[numArr.length-1]);
    }
	
	public static void main(String[] args) {
		System.out.println(solution("-1 -2 -3 -4"));
	}
}