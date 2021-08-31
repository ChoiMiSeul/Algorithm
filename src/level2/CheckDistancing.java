package level2;

public class CheckDistancing {
	public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i=0; i<places.length; i++) { // 행
        	for(int j=0; j<places[i].length; j++) { // 열
        		for(int k=0; k<places[i][j].length(); k++) { // 해당 행렬 문자열
        			char c = places[i][j].charAt(k);
        			
        			switch(c) {
        			case 'P':
        				break;
        				
        			case 'O':
        				int countP = 0;
        				answer[i] = countP > 1 ? 0 : 1;
        				break;
        			}
        		}
        	}
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[][] p = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
				{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		System.out.println(solution(p));
	}
}
