package level1;

public class ReverseTernary {
	/**
	 * 프로그래머스 Level 1 3진법 뒤집기 
	 * https://programmers.co.kr/learn/courses/30/lessons/68935
	 * 점수 : 
	 */
	public int solution(int n) {
		// 1. 10진수를 3진수로 변환
		// 2. 3진수 리버스
		// 3. 10진수 다시 변환
		String reverse="";
		
		while(n>=3) {
			reverse+=(n%3);
			n=n/3;
		}
		reverse=reverse+n;
		
	    int answer = Integer.parseInt(reverse.toString(), 3);    //3진법 to 10진법
		return answer;
	}

	public static void main(String[] args) {
	}
}
