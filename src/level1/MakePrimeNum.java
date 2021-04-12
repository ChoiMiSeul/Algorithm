package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MakePrimeNum {
	/**
	 * 프로그래머스 Level 1 소수 만들기
	 * https://programmers.co.kr/learn/courses/30/lessons/12977
	 * 점수 : +4
	 * 날짜 : 210407,09
	 */
	public static int solution(int[] nums) {
        //합한 값을 새로 넣을때는 기존 값과 같은지 비교해서 다르면 넣기
		int answer = 0;
        
        for(int i=0; i<nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			if(i != j && j != k && i != k) {        	
        				int sum = (nums[i]+nums[j]+nums[k]);
        				int count=0;
        				for(int q=2; q<=sum; q++) {
        	    			if(sum % q == 0)	count++;
        	    		}
        	        	if(count==1) answer++;
        	        	count=0;
        			}
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}
}
