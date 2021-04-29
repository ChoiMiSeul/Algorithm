package level1;

import java.util.Arrays;

public class Budget {
	/**
	 * 프로그래머스 Level 1 예산
	 * https://programmers.co.kr/learn/courses/30/lessons/12982
	 * 점수 : +3
	 * 날짜 : 210412,26
	 */
	public static int solution(int[] d, int budget) {
		// d를 정렬
		// d의 길이만큼 for문 돌리고 
		// 배열의 길이를 뒤에서부터 1씩(큰 값을) 줄여가며 합 구하기
		// 그 합이 예산보다 같거나 작으면 배열 크기 리턴
		// 크면 한번씩 더 줄이기 <<<<<는 아래 내 코드 로직
        int sum = 0;
        int count = 0;
        Arrays.sort(d);
        
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
			if(sum > budget) {
				break;
			}
			count++;
		}
		
		return count;
    }

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		System.out.println(solution(d, 10));
	}
}


/*
내 실패코드 1
for(int i = 0; i < d.length; i++) {
for(int j = 0; j < d.length-i; j++) {
	sum+=d[j];        		
}
if(sum <= budget) {
	return d.length-i;
}
if(d[0] >= budget) {
	i++;
}
sum=0;
}
return d.length;
*/

/*
이해 안 되는 인터넷 코드1
int sum = 0;
int answer = 0;
Arrays.sort(d);

for(int i = 0; i < d.length; i++) {
	sum += d[i];
	if(sum > budget) {
		answer = i;
		break;
	}
}
if(sum <= budget) {
	answer = d.length;
}
*/