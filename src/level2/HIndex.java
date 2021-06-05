package level2;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
	/**
	 * 프로그래머스 Level2 H-index
	 * https://programmers.co.kr/learn/courses/30/lessons/42747
	 * 점수 : +8
	 * 날짜 : 210605
	 */
	public static int solution(int[] citations) {
        int count = 0;
       
        Integer[] IntegerC=Arrays.stream(citations).boxed().toArray(Integer[]::new);  
        Arrays.sort(IntegerC, Collections.reverseOrder());
        
        for(int i=0; i<citations.length; i++) {
        	if(i+1 <= IntegerC[i]) count++;
        	else break;
        }
        
        return count;
    }

	public static void main(String[] args) {
		int[] a = {25, 8, 5, 3, 3};
		System.out.println(solution(a));
	}
}
