package level1;

import java.util.Arrays;

public class KNum {
	/**
	 * 프로그래머스 Level 1 K번째수 
	 * https://programmers.co.kr/learn/courses/30/lessons/42748
	 * 점수 : +1
	 * 날짜 : 210329
	 */
	public static int[] solution(int[] array, int[][] commands) {
		// i번째부터 j번째까지 배열 자른 후 정렬하여 k번째 수 배열에 담기
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //commands[i][0]부터 commands[i][1]까지 sortArr에 저장
			Arrays.sort(temp);
			answer[i]=temp[commands[i][2]-1];
		}		
		return answer;
	}

	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(solution(array, commands));
	}
}
