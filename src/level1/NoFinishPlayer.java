package level1;

public class NoFinishPlayer {
	/**
	 * ���α׷��ӽ� Level 1 �������� ���� ���� 
	 * https://programmers.co.kr/learn/courses/30/lessons/42576
	 * ���� :
	 * ��¥ : 210312 12:40~
	 */
	public static String solution(String[] participant, String[] completion) {
		//1. �迭 ��
		//2. �迭�� ���� ���� �� ��ȯ
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
