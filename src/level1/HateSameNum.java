package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HateSameNum {
	/**
	 * 프로그래머스 Level 1 같은 숫자는 싫어
	 * https://programmers.co.kr/learn/courses/30/lessons/12906
	 * 점수: +3
	 * 날짜 : 210325 22:00~12:50 gg
	 */
	public static int[] solution(int[]arr) {
		ArrayList<Integer> list = new ArrayList<>(); //리스트 생성
		int current = 10;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]!=current) {
				list.add(arr[i]);
				current=arr[i];
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr= {0,1,1};
		System.out.println(solution(arr));
	}

}
