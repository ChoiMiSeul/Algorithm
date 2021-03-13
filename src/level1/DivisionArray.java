package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisionArray {
	/**
	 * 프로그래머스 Level 1 나누어 떨어지는 숫자 배열
	 * https://programmers.co.kr/learn/courses/30/lessons/12910
	 * 점수 : +1
	 * 날짜 : 210310
	 */
	public static int[] solution(int[] arr, int divisor) {
		//1. divisor로 나누어 지는지 확인
		//2. 나누어 지는 값들 배열에 오름차순 정렬
		//3. 없다면 -1 반환
		Integer[] answer= {};
		
		List<Integer> num = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				num.add(arr[i]);
			}else if(num.size()==0) return new int[] {-1};
		}
		
		answer=num.toArray(new Integer[num.size()]);
	
		Arrays.sort(answer);
		return (int[])answer;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		solution(arr,2);
	}
}