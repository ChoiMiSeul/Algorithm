package level1;

import java.util.Arrays;

public class NoFinishPlayer {
	/**
	 * ���α׷��ӽ� Level 1 �������� ���� ���� 
	 * https://programmers.co.kr/learn/courses/30/lessons/42576
	 * ���� : +8
	 * ��¥ : 210312 12:40~
	 */
	public static String solution(String[] participant, String[] completion) {
		//1. �迭 ��
		//2. �迭�� ���� ���� �� ��ȯ
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
	    return participant[participant.length-1];
	}
}

/*		
		for(int i=0;i<participant.length;i++) {
			for(int j=0;j<completion.length;j++) {
				if(participant[i]==completion[j]) {
					participant[i]= "";
				}
			}
		}
		
		answer=participant[participant.length-1]
	    return answer;
 */
