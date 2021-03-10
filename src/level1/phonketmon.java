package level1;

import java.util.HashSet;
import java.util.Set;

public class phonketmon {
	/**
	 * 프로그래머스 Level 1 폰켓몬
	 * https://programmers.co.kr/learn/courses/30/lessons/1845
	 * 점수 : +3점
	 */
	public int solution(int[] nums) {
		//1. n마리중 n/2마리 가져갈 수 있음
		//2. 같은 종류는 같은 번호
		//3. 다양한 폰켓몬 가지길 원함
	       int answer = 0;
	       int myNum=nums.length/2; //가질 수 있는 개수
	            
	       
	       Set<Integer> set = new HashSet<>();
	       for(int i=0;i<nums.length;i++) {
	    	   set.add(nums[i]);
	       }
	       
	       if(set.size()==myNum) {
	    	   answer=set.size();
	       }else if(set.size()>myNum) {
	    	   answer=myNum;
	       }else if(set.size()<myNum) {
	    	   answer=set.size();
	       }
	       //set.size() < nums.length/2 ? set.size() : num.length/2;
	       return answer;
	}

	public static void main(String[] args) {
	}

}
