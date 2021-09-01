package level2;

public class TriangleSnail {
	/**
	 * 프로그래머스 Level2 삼각달팽이
	 * https://programmers.co.kr/learn/courses/30/lessons/68645
	 * 점수 : +3
	 * 날짜 : 210902
	 */
	public static int[] solution(int n) {
		int max = n*(n+1)/2;
		int[] answer = new int[max];
        int[][] snail = new int[n][n];
        
        int value = 1;
        int x=0, y=0;
        snail[x][y] = 1;
        
        while(value < max) {
        	// 아래로
        	while(x + 1 < n && snail[x+1][y] == 0) {
        		snail[++x][y] = ++value;
        	}        
        	
        	// 오른쪽으로
        	while(y + 1 < n && snail[x][y+1] == 0) {
        		snail[x][++y] = ++value;
        	}
        	
        	// 대각선으로
        	while(snail[x-1][y-1] == 0) {
        		snail[--x][--y] = ++value;
        	}
        }
        
        int idx = 0;
        for(int i=0; i<snail.length; i++) {
        	for(int j=0; j<=i; j++) {
        		answer[idx++] = snail[i][j];
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(5));
	}
}
