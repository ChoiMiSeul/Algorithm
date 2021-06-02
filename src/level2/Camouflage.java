package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Camouflage {
	/**
	 * 프로그래머스 Level2 위장
	 * https://programmers.co.kr/learn/courses/30/lessons/42578
	 * 점수 : +2
	 * 날짜 : 210602
	 */
	public static int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {    	
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);	
        }
        
        for(Integer i : map.values()) {
        	answer *= i+1;
        }
        
        return answer - 1;
    }
	
	
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}

}
