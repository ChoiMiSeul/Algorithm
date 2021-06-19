package level2;

import java.util.Stack;

public class RemovePairs {
	/**
	 * 프로그래머스 Level2 짝지어 제거하기
	 * https://programmers.co.kr/learn/courses/30/lessons/12973
	 * 점수 : +8
	 * 날짜 : 210619
	 */
	public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
        	if(!stack.isEmpty() && s.charAt(i) == stack.peek()) {
        		stack.pop();
        	}else {
        		stack.push(s.charAt(i));
        	}
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
	
	public static void main(String[] args) {
		String s = "cdcd";
		System.out.println(solution(s));
	}
}