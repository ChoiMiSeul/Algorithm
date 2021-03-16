package level1;

public class HashadNum {
	/**
	 * 프로그래머스 Level 1 하샤드 수
	 * https://programmers.co.kr/learn/courses/30/lessons/12947
	 * 점수 : +1
	 * 날짜 : 210316
	 */
	public static boolean solution(int x) {
		int sum=0;
		int n=x;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		return x%sum==0 ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(11));
	}
}
