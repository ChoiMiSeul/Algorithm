package level2;

public class MultiplicationMatrix {
	/**
	 * 프로그래머스 Level2 행렬의곱셈
	 * https://programmers.co.kr/learn/courses/30/lessons/12949
	 * 점수 : +5
	 * 날짜 : 210624
	 */
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr2[0].length; j++) {
        		for(int k=0; k<arr1[0].length; k++) {
        			answer[i][j] += arr1[i][k] * arr2[k][j];
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] a = {{1,4},{3,2},{4,1}};
		int[][] b = {{3,3},{3,3}};
		System.out.println(solution(a,b));
	}
}