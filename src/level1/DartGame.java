package level1;

import java.util.StringTokenizer;

public class DartGame {
	public static int solution(String dartResult) {
        int answer = 0;
        int[] ansArr = new int[3];
        int idx = 0;
        int temp = 0;
        
        for(int i = 0; i < dartResult.length(); i++) {
        	char c = dartResult.charAt(i);
        	
        	if(Character.isDigit(c)) {
        		if(c=='1' && dartResult.charAt(i+1)=='0') {
        			temp = 10;
        			i++;
        		}else {
        			temp = Character.getNumericValue(c);
        		}
        	}else {
        		switch(c) {
        		case 'S':
        			ansArr[idx++] = (int) Math.pow(temp, 1);
        			//System.out.println(temp);
        			break;
        		case 'D':
        			ansArr[idx++] = (int) Math.pow(temp, 2);
        			break;
        		case 'T':
        			ansArr[idx++] = (int) Math.pow(temp, 3);
        			break;
        		case '*':
        			if(i == 2) {
        				ansArr[idx-1] = ansArr[idx-1]*2; 
        			}else {
        				ansArr[idx-2] = ansArr[idx-2]*2;
        				ansArr[idx-1] = ansArr[idx-1]*2;
        				//System.out.println(ansArr[idx-2]);
        			}
        			break;
        		case '#':
        			ansArr[idx-1] *= (-1);
        			break;
        		default :
        		}
        	}
        }
        
        for(int i=0; i<3; i++) {
        	answer+=ansArr[i];
        	System.out.println(ansArr[i]+"!");
        }
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution("1D2S0T"));
	}
}
