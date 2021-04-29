package level2;

import java.util.Stack;

public class StockPrice {
	/**
	 * 프로그래머스 Level 2 주식가격
	 * https://programmers.co.kr/learn/courses/30/lessons/42584#
	 * 점수 : +4
	 * 날짜 : 210429
	 */
	public static int[] solution(int[] prices) {
		//1. for문으로 prices 돌며 현재 인덱스의 값보다 작은 값 있는지 확인
		//2. 없다면 배열길이-현재인덱스 return에 저장
		//3. 있다면 그 값의 인덱스-현재인덱스 return에 저장.
		//3-1. 3의 주의점 : 가장 처음 나온 값만 저장해야함. break사용?
		int[] answer = new int[prices.length];
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if (prices[i] > prices[j]) {
					answer[i] = j - i;
					break;
				}
				if(j==answer.length-1) answer[i] = j - i; //j가 끝까지 돌았다면 본인보다 작은 값이 없는 것이므로 배열의 크기 - 현재 위치 
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3}; //1,2,3,2,3,3,1
		System.out.println(solution(prices));
	}
}

//for (int i = 0; i < prices.length; i++) {
//	for (int j = i+1; j < prices.length; j++) {
//		if (prices[i] > prices[j]) {
//			answer[idx++] = j - i;
//			break;
//		}else {
//			answer[idx++] = prices.length - i -1;
//			break;
//		}
//	}
//}