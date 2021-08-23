package level2;

import java.util.Arrays;

public class HasLand {
	/**
	 * 프로그래머스 Level2 땅따먹기
	 * https://programmers.co.kr/learn/courses/30/lessons/12913
	 * 점수 : +11
	 * 날짜 : 210823
	 */
	static int solution(int[][] land) {
		
		for(int i=1; i<land.length; i++) { 
			for(int j=0; j<4; j++) { 
				int num = land[i][j];
				for(int k=0; k<4; k++) {
					if(k != j) {
						land[i][j] = Math.max(land[i][j], num+land[i-1][k]);
					}
				}
			}
		}
		
		Arrays.sort(land[land.length-1]);
		return land[land.length-1][3];
	}

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(land));
	}
}
