package level1;

public class NoFinishPlayer {
	/**
	 * 프로그래머스 Level 1 완주하지 못한 선수 
	 * https://programmers.co.kr/learn/courses/30/lessons/42576
	 * 점수 :
	 * 날짜 : 210312 12:40~
	 */
	public static String solution(String[] participant, String[] completion) {
		//1. 배열 비교
		//2. 배열에 있지 않은 값 반환
		String answer = "";
		
		for(int i=0;i<participant.length;i++) {
			for(int j=0;j<completion.length;j++) {
				if(participant[i]==completion[j]) {
					participant[i]= "";
				}
			}
		}
		
		for(int i=0;i<participant.length;i++) {
			answer=participant[i];
		}
	    return answer;
	}

	public static void main(String[] args) {
		String[] arr=new String[] {"leo", "kiki", "eden"};
		String[] arrr=new String[] {"eden", "kiki"};
		System.out.println(solution(arr,arrr));
	}

}
