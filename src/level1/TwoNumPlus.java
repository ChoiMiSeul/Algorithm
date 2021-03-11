package level1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TwoNumPlus {
	/**
	 * 프로그래머스 Level 1 두 개 뽑아서 더하기
	 * https://programmers.co.kr/learn/courses/30/lessons/68644 
	 * 점수 : +6
	 * 날짜 : 210311 23:00~03:12
	 */
	public static int[] solution(int[] numbers) {
		// 1. 입력받은 배열에서 두개의 숫자 선택 <-for문 돌려서 모든 수 합하기 본인끼리 합은ㄴㄴ
		// 2. 그 숫자를 더해서 나올 수 있는 모든 수 배열에 저장 <- set이용해서 중복 삭제
		// 3. 오름차순 정렬 <-버블소트 or ArraysSort
		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j)
					set.add(numbers[i] + numbers[j]);
			}
		}
		
		return set.stream().mapToInt(Integer::intValue).toArray();

		/*ArrayList<Integer> list = new ArrayList<>(set);
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}*/
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2 };
		solution(arr);
		System.out.println("연봉 사천");
	}

}
