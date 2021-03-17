package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntReverseArray {
	/**
	 * 프로그래머스 Level 1 자연수 뒤집어 배열로 만들기
	 * https://programmers.co.kr/learn/courses/30/lessons/12932
	 * 점수 : +4
	 * 날짜 : 210317 00:30~
	 */
	public static int[] solution(long n) {
		String[] arr=(n+"").split("");
		int[] answer= new int[arr.length];
		Collections.reverse(Arrays.asList(arr));
		for(int i=0;i<arr.length;i++) {
			answer[i]=Integer.parseInt(arr[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(34125));
	}
}

/*
List<Integer> list = new ArrayList<>();
n=(int)n;
int[] arr= {};
int idx=0;
while(n>0) {
	list.add((int)(n%10));
	n=n/10;
}
return list.stream().mapToInt(Integer::intValue).toArray();
*/