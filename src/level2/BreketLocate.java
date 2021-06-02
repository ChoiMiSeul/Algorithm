package level2;

import java.util.Stack;

public class BreketLocate {
	/**
	 * 프로그래머스 Level 2 괄호 회전하기
	 * 
	 * 점수 : +10
	 * 날짜 : 210510
	 */
	public static int solution(String s) {
		// s 배열에 넣어서 한칸씩 이동시키는 for문 작성
		// for문 안에 switch case로 여는 괄호에 대한 닫는 괄호가 있는지 확인
		// 있으면 answer++
        int answer = 0;
        char[] sArr = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
        	sArr[i] = s.charAt(i);
        }

        for(int i=0; i<s.length(); i++) {
        	char tmp = sArr[0];
        	for(int j=0; j<s.length()-1; j++) {
        		sArr[j] = sArr[j+1];
        	}
        	sArr[s.length()-1] = tmp;
//            System.out.print(sArr[i]);
			String str = String.valueOf(sArr);
        	if(str.length()%2!=0) break;

        	for(int j=0; j<s.length(); j++) {
        		switch(sArr[j]) {
                case '}':
                	if(!stack.isEmpty()) {
                		if(stack.peek().equals('{')) {
                			stack.pop();
                		}
                	}
                	break;
                case ']':
                	if(!stack.isEmpty()) {
                		if(stack.peek().equals('[')) {
                			stack.pop();
                		}
                	}
                	break;
                case ')':
                	if(!stack.isEmpty()) {
                		if(stack.peek().equals('(')) {
                			stack.pop();
                		}
                	}
                	break;
                default :
                	System.out.println(sArr[j]);
                	stack.push(sArr[j]);
                	break;
                }
        	}if(stack.isEmpty()) answer++;
            stack.clear();
        }    
        
        return answer; 
    }

	public static void main(String[] args) {
		System.out.println(solution("}}}"));
	}
}
