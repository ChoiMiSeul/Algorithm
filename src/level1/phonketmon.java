package level1;

import java.util.HashSet;
import java.util.Set;

public class phonketmon {
	/**
	 * ���α׷��ӽ� Level 1 ���ϸ�
	 * https://programmers.co.kr/learn/courses/30/lessons/1845
	 * ���� : +3��
	 */
	public int solution(int[] nums) {
		//1. n������ n/2���� ������ �� ����
		//2. ���� ������ ���� ��ȣ
		//3. �پ��� ���ϸ� ������ ����
	       int answer = 0;
	       int myNum=nums.length/2; //���� �� �ִ� ����
	            
	       
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
