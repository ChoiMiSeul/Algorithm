package level1;

public class CarculationLessMoney {
	/**
	 * 프로그래머스 Level1 부족한 금액 계산하기
	 * https://programmers.co.kr/learn/courses/30/lessons/82612
	 * 점수 : +2
	 * 날짜 : 210915
	 */
	public static long solution(int price, int money, int count) {
        long sum = 0;
        
        for(int i=count; i>0; i--) {
        	sum += price*i;
        }

        return sum > money ? sum - money : 0;
    }

	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}
}
