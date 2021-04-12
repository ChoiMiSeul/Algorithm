package level1;

public class PushKeyPad {
	/**
	 * 프로그래머스 Level 1 키패드 누르기
	 * https://programmers.co.kr/learn/courses/30/lessons/67256
	 * 점수 : +3
	 * 날짜 : 21040n ~ 12
	 */
	public static String solution(int[] numbers, String hand) {
		// 1. 왼손엄지는 *, 오른손엄지는 #에서 시작
		// 2. 1,4,7 > 왼손, 3,6,9 > 오른손, 2,5,8,0 > 현재 위치에서 가까운 쪽(같다면 사용자 손잡이 사용)
		// 3. numbers(누를 번호), hand(손잡이). 번호를 누른 손이 어느 손인지 연속된 문자열 형태로 return
		String answer = "";
        int left =10;
        int right =12;
        
        for(int i = 0; i<numbers.length; i++) {
        	if(numbers[i]==0) numbers[i]=11;
        
        	if(numbers[i]==1 | numbers[i]==4 | numbers[i]==7) {
     	    	left = numbers[i];
     	    	answer+="L";
     	    }
        	if(numbers[i]==3 | numbers[i]==6 | numbers[i]==9) {
     	    	right = numbers[i];
     	    	answer+="R";
     	    }
    	    if(numbers[i]==2 | numbers[i]==5 | numbers[i]==8 | numbers[i]==11) {
    	    	int leftXY = Math.abs((left-numbers[i])/3) + Math.abs((left-numbers[i])%3);
    	    	int rightXY = Math.abs((right-numbers[i])/3) + Math.abs((right-numbers[i])%3);
    	    	
    	    	if(leftXY > rightXY) {
    	    		right = numbers[i];
        	    	answer+="R";
    	    	}else if(leftXY < rightXY) {
    	    		left = numbers[i];
        	    	answer+="L";
    	    	}else if(leftXY == rightXY){
    	    		if(hand.equals("right")) {
    	    			right = numbers[i];
            	    	answer+="R";
    	    		}
    	    		if(hand.equals("left")){
    	    			left = numbers[i];
            	    	answer+="L";
    	    		}
    	    	}
    	    }
        }
        return answer;
    }

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}; //1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5
		System.out.println(solution(numbers, "right"));
	}
}
