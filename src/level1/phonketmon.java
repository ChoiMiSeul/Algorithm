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
		//4. 최대한 다양한 포켓몬을 가질 수 있는 종류의 개수
		int myNum=nums.length/2;
		
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		
	    return set.size()>=myNum ? myNum : set.size();
	}

	public static void main(String[] args) {
	}

}
