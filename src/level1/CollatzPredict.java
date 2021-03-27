package level1;

public class CollatzPredict {
	/**
	 * 프로그래머스 Level 1 콜라츠 추측
	 * https://programmers.co.kr/learn/courses/30/lessons/12943 
	 * 점수 : +6
	 * 날짜 : 210326~
	 * 문제점 : -1 반환 실패 > int형 계산 중, 범위를 벗어난 계산 실패로 long형 변경시 모든 계산 가능
	 */
	public static int solution(int num) {
		int count = 0;
		long a = num;
		while (a != 1) {
			if (count == 500)
				return -1;
			if (a % 2 == 0)
				a = a / 2;
			else if( a % 2 != 0)
				a = a * 3 + 1;
			count++;
		}
		
		return count;

	}

	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
}
/*
package level1;

public class CollatzPredict {
	public static int solution(int num) {
		int count=0;
		while(num!=1 && count!=500) {
			if(num%2==0) num=num/2;
			else num=num*3+1;
			count++;
		}
		if(count==500)	return -1;
		return count;
	}
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
}
*/