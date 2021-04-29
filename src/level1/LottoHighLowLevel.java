package level1;

import java.util.HashSet;
import java.util.Set;

public class LottoHighLowLevel {
	/**
	 * 프로그래머스 Level 1 로또의 최고 순위와 최저 순위
	 * https://programmers.co.kr/learn/courses/30/lessons/77484
	 * 점수 : +5
	 * 날짜 : 210427
	 */
	public static int[] solution(int[] lottos, int[] win_nums) {
		// 1. 순서 상관 없이 일치하는 번호 있으면 맞힌 거
		// 2. 산 로또 lottos, 당첨 번호 win_nums, 최고순위와 최저순위 담은 배열 return
		int countZero = 0;
		int countSameNum = 0;

		int[] level = {6,6,5,4,3,2,1};
		
		//셋을 이용해서 for문 한번만 돌리기
		//비교는 set.contains를 사용 
		//확장성을 고려해서 고쳐보기
		
		Set<Integer> set = new HashSet<>();
		for(int e : win_nums) {
			set.add(e);
		}
		
		for(int e : lottos) {
			if(e == 0) {
				countZero++;
				continue;
			}
			if(set.contains(e)) countSameNum++;
		}
		
		return new int[] {level[countSameNum+countZero], level[countSameNum]};
	}

	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		solution(lottos, win_nums);
	}
}

/**
 * 1. 중복된 숫자 있는지 찾고 그 숫자 제외
2. 최고 순위 : 0인 숫자가 모두 일치하는 경우
3. 최저 순위 : 중복 숫자 개수로 판단

1-1 중복된 숫자 담을 배열 선언하고 이중포문으로 중복됐는지 확인하여 넣기
2-1 1의 배열의 개수 + 0의 개수 세서 최고순위 판단
3-1 1의 배열의 개수 새서 최저순위 판단

 */

/*
int[] answer = new int[2];
List<Integer> list = new ArrayList<>();
int lowLevel = 0;
int countZero = 0;

for (int i = 0; i < lottos.length; i++) {
	if(lottos[i] == 0) {
		countZero++;
	}
	for (int j = 0; j < win_nums.length; j++) {
		if (lottos[i] == win_nums[j]) {
			list.add(lottos[i]);
		}
	}
}

switch (list.size()) {
case 0:
	lowLevel = 6;
	break;
case 1:
	lowLevel = 6;
	break;
case 2:
	lowLevel = 5;
	break;
case 3:
	lowLevel = 4;
	break;
case 4:
	lowLevel = 3;
	break;
case 5:
	lowLevel = 2;
	break;
case 6:
	lowLevel = 1;
	break;
}

int highLevel = 0;
switch (list.size()+countZero) {
case 0:
	highLevel = 6;
	break;
case 1:
	highLevel = 6;
	break;
case 2:
	highLevel = 5;
	break;
case 3:
	highLevel = 4;
	break;
case 4:
	highLevel = 3;
	break;
case 5:
	highLevel = 2;
	break;
case 6:
	highLevel = 1;
	break;
}

answer[0] = highLevel;
answer[1] = lowLevel;
return answer;
*/