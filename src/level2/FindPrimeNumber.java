package level2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 프로그래머스 Level2 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/42839
 * 점수 : +4
 * 날짜 : 210815
 */
public class FindPrimeNumber {
	Set<Integer> set;
	boolean[] visited;

	public int solution(String numbers) {
		set = new HashSet<>(); // 조합담기
		visited = new boolean[numbers.length()]; // 이전값 선택여부

		String[] strToInt = numbers.split("");
		int[] intArr = Arrays.asList(strToInt).stream().mapToInt(Integer::parseInt).toArray();
		combine(intArr, "");

		int count = 0;
		Iterator<Integer> da = set.iterator();
		while (da.hasNext()) {
			int number = da.next();
			if (primeNum(number)) {
				count++;
			}
		}
		
//		Set<Integer> s = set.stream().filter(i -> primeNum(i)).collect(Collectors.toSet());
//		System.out.println(s.size());
		
		return count;
	}

	public void combine(int[] num, String combinedNum) {
		// 선택된 건 선택x
		// 선택 여부 판단 boolean visited

		// 재귀 1.종료조건 2.로직
		if (!combinedNum.equals("")) {
			set.add(Integer.parseInt(combinedNum));
		}

		for (int i = 0; i < num.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				combine(num, combinedNum + num[i]);
				visited[i] = false;
			}
		}
	}

	public boolean primeNum(int n) {
		if(n < 2) {
			return false;
		}
		
		if(n == 2) {
			return true;
		}
        
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		FindPrimeNumber a = new FindPrimeNumber();
		System.out.println(a.solution("011"));
	}
}
