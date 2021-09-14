package level2;

public class CheckDistancing {
	/**
	 * 프로그래머스 Level2 거리두기 확인하기
	 * https://programmers.co.kr/learn/courses/30/lessons/81302
	 * 점수 : +5
	 * 날짜 : 210915
	 * 참조 : https://velog.io/@cgw981/2021-카카오-채용연계형-인턴십-거리두기-확인하기-JAVA
	 */
	public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i=0; i<places.length; i++) { // 행
        	answer[i] = solution(places[i]);
        }
        
        return answer;
    }
	
	public static int solution(String[] place) {
		String[][] arr = twoDiArr(place);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int sum = arr[i][j].equals("P") ? 1 : 0;
				
				if(arr[i][j].equals("X")) continue;
				
				if(i > 0) sum += arr[i-1][j].equals("P") ? 1 : 0; // 상
				if(i < arr.length - 1) sum += arr[i+1][j].equals("P") ? 1 : 0; // 하
				if(j > 0) sum += arr[i][j-1].equals("P") ? 1 : 0; // 좌
				if(j < arr.length - 1) sum += arr[i][j+1].equals("P") ? 1 : 0; // 우
				
				if(sum >= 2) return 0;
			}
		}
		return 1;
	}
	
	public static String[][] twoDiArr(String[] place) {
		String[][] twoArr = new String[5][5];
		
		for(int i=0; i<place.length; i++) {
			String text = place[i];
			for(int j=0; j<text.length(); j++) {
				twoArr[i][j] = text.charAt(j)+"";
			}
		}
		
		return twoArr;
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
