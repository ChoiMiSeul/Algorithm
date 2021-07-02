package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeALargeNumber {
	public static String solution(String number, int k) {
		String[] numS = number.split("");		
        int[] num = Arrays.stream(numS).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(num);
        int[] deleteNum = new int[k];
        
        for(int i=0; i<k; i++) {
        	deleteNum[i] = num[i];
        }
        
        num = Arrays.stream(numS).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<num.length; i++) {
        	for(int j=0; j<k; j++) {
        		if(num[i] == deleteNum[j]) {
        			break;
        		}else {
        			list.add(num[i]);
        			System.out.print(num[i]);
        		}
        	}
        }
        
        return "";
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1924",2));
	}
}
