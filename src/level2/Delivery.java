package level2;

public class Delivery {
	/**
	 * 프로그래머스 Level2 배달
	 * https://programmers.co.kr/learn/courses/30/lessons/12978
	 * 점수 : +7
	 * 날짜 : 210909
	 * 비고 : 블로그 참조
	 */
	public int solution(int N, int[][] road, int K) {
		// 플로이드 와샬 풀이법
        int[][] map = new int[N][N];
        
        for(int i=0; i<map.length; i++) {
        	for(int j=0; j<map[0].length; j++) {
        		if(i == j) {
        			map[i][j] = 0;
        			continue;
        		}
        		map[i][j] = 500001;
        	}
        }
        
        for(int i=0; i<road.length; i++) {
        	if(map[road[i][0] - 1][road[i][1] - 1] <= road[i][2]) continue;
        	map[road[i][0] - 1][road[i][1] - 1] = road[i][2];
        	map[road[i][1] - 1][road[i][0] - 1] = road[i][2];
        }
        
        // 플로이드 와샬
        for(int k=0; k<N; k++) { // 거쳐가는 노드 개수
        	for(int i=0; i<N; i++) { // 시작 노드
        		for(int j=0; j<N; j++) { // 목표 노드
        			if(i == j) continue;
        			if(map[i][j] > map[i][k] + map[k][j]) {
        				map[i][j] = map[i][k] + map[k][j]
        			}
        		}
        	}
        }
		
		int answer = 0;
		
		for(int i=0; i<map[0].length; i++) {
			if(map[0][i] <= K) answer++;
		}
		
        return answer;
    }
}
