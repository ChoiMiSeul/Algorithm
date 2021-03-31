package level1;

import java.util.Arrays;

public class MostSmallestNum {
	/**
	 * 프로그래머스 Level 1 제일 작은 수 제거하기
	 * https://programmers.co.kr/learn/courses/30/lessons/12935
	 * 점수 : +6
	 * 날짜 : 2103301
	 */
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length != 1 ? arr.length - 1 : 1];
		int[] sortArr = Arrays.copyOf(arr, arr.length);
		int idx = 0;
		Arrays.sort(sortArr);		
		if (arr.length == 1) {
			answer[0] = -1;
		} else {
			for (int i = 0; i < arr.length ; i++) {
				if (arr[i] != sortArr[0]) {
					answer[idx++] = arr[i];
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 9 };
		System.out.println(solution(arr));
	}
}
