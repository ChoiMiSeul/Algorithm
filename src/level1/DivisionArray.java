package level1;

import java.util.Arrays;

public class DivisionArray {
	/**
	 * ���α׷��ӽ� Level 1 ������ �������� ���� �迭
	 * https://programmers.co.kr/learn/courses/30/lessons/12910
	 * ���� : +1
	 * ��¥ : 210310
	 */
	public static int[] solution(int[] arr, int divisor) {
		//1. divisor�� ������ ������ Ȯ��
		//2. ������ ���� ���� �迭�� �������� ����
		//3. ���ٸ� -1 ��ȯ
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