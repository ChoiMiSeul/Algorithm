package level1;

public class MatrixSum {
	/**
	 * 프로그래머스 Level 1 행렬의 덧셈
	 * https://programmers.co.kr/learn/courses/30/lessons/12950
	 * 점수 : +1
	 * 날짜 : 210331
	 */
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j< arr1[i].length; j++) {
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
	}
}
//arr1[0][1]+arr2[0][1]