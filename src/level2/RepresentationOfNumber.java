package level2;

public class RepresentationOfNumber {
	/**
	 * 프로그래머스 Level2 숫자의 표현
	 * https://programmers.co.kr/learn/courses/30/lessons/12924
	 * 점수 : +5
	 * 날짜 : 210603
	 */
	public static int solution(int n) {
		//연속된 자연수로 주어진 자연수 n을 표현할 수 있는 방법의 수
        int count = 0;
        int sum = 0;
        
        for(int i=1; i<=n; i++) {
        	for(int j=i; sum<=n; j++) {
        		sum += j;        		
        		if(sum == n) {
        			count++;
        			i++;
        		}
        	}
        	sum = 0;
        }
        
		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}
