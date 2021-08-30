package level2;

public class VowelDictionary {
	/**
	 * 프로그래머스 Level2 5주차-모음 사전
	 * https://programmers.co.kr/learn/courses/30/lessons/84512
	 * 점수 : +1
	 * 날짜 : 210830
	 */
	public static int solution(String word) {
		int answer = 0;
		
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			
			switch(c) {
			case 'A':
				answer += 1;
				break;
			case 'E':
				int numE = 782;
				for(int j=0; j<i; j++) {					
					numE = (numE + 3)/5;
				}
				answer += numE;
				break;
			case 'I':
				int numI = 1563;
				for(int j=0; j<i; j++) {					
					numI = (numI + 3)/5;
				}
				answer += numI;
				break;
			case 'O':
				int numO = 2344;
				for(int j=0; j<i; j++) {					
					numO = (numO + 3)/5;
				}
				answer += numO;
				break;
			case 'U':
				answer += Math.pow(5, 5 - i);
				break;
			default :
				break;
			}
				
		}
		
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution("EIO"));
	}
}
