package level1;

import java.util.Arrays;

public class DivisionArray {
	/**
	 * 프로그래머스 Level 1 나누어 떨어지는 숫자 배열
	 * https://programmers.co.kr/learn/courses/30/lessons/12910
	 * 점수 : +1
	 * 날짜 : 210310
	 */
	public static int[] solution(int[] arr, int divisor) {
		//1. divisor로 나누어 지는지 확인
		//2. 나누어 지는 값들 배열에 오름차순 정렬
		//3. 없다면 -1 반환
		int[] answer= {};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				count++;
			}
		}
		
		if(count==0) return new int[] {-1};
		else answer=new int[count];
			
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				answer[index++]=arr[i];
			}
		}		
		
		//Arrays.sort(answer);
		for(int i = answer.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(answer[j]>answer[j+1]) {
					int tmp=answer[j];
					answer[j]=answer[j+1];
					answer[j+1]=tmp;
				}
			}
		}
		
		return answer;
	}
}