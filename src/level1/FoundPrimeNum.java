package level1;

public class FoundPrimeNum {
	/**
	 * 프로그래머스 Level 1 소수찾기
	 * https://programmers.co.kr/learn/courses/30/lessons/12921
	 * 점수 : +12
	 * 작성 날짜 : 210308
	 */
	public static int solution(int n) {
		//1. 자연수 입력
		//2. 1부터 입력값 사이의 숫자 중 소수만 출력
		int answer=0;
		
		for(int i=2;i<=n;i++) { //2부터 n까지
			boolean flag=true; //모두 트루
			for(int j=2;j<Math.sqrt(i);j++) { //2부터 i까지
				if(i%j==0) { //현재 값을 2부터 현재 값까지로 나눈 나머지가 0이면
					flag=false; //그 값 제외
					break;
				}
			}
			if(flag==true)	answer++;
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		solution(10);
		//System.out.println(solution(10));
	}
}
