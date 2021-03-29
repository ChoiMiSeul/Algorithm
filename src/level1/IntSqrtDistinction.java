package level1;

public class IntSqrtDistinction {
	/**
	 * 프로그래머스 Level 1 정수 제곱근 판별
	 * https://programmers.co.kr/learn/courses/30/lessons/12934
	 * 점수 : +4
	 * 날짜 : 210329
	 */
	public static long solution(long n) {
		long answer=0;
		//return Math.sqrt(n)-(int)Math.sqrt(n)==0.0 ? (long) ((Math.sqrt(n)+1) * (Math.sqrt(n)+1)) : -1;
		
		if(Math.sqrt(n)-(int)Math.sqrt(n)==0.0) { //자기 자신에서 정수를 뺐을 때 0이면 정수
			return (long) Math.pow(Math.sqrt(n)+1,2);
		}else {
			return -1;
		}
		
	}//Math.sqrt(n)%1==1

	public static void main(String[] args) {
		System.out.println(solution(121));
	}
}
