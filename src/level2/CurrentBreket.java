package level2;

import java.util.Stack;

public class CurrentBreket {
	/**
	 * 프로그래머스 Level2 올바른 괄호
	 * https://programmers.co.kr/learn/courses/30/lessons/12909
	 * 점수 : +5
	 * 날짜 : 210603
	 */
	static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
        	switch(s.charAt(i)) {
        	case '(':
        		stack.push(s.charAt(i));
        		break;
        	case ')':
        		if(!stack.isEmpty()) stack.pop();
        		else return false;
        		break;
        	}
        }
        
        return stack.isEmpty() ? true : false;
    }

	public static void main(String[] args) {
		System.out.println(solution(")()("));
	}
}