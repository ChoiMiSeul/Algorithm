package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeALargeNumber {
	public static String solution(String number, int k) {
//		1. int형 배열로 변환
//		2. 정렬해서 가장 작은 수 k개 다른 배열에 넣기
//		3. 1에서 2와 같지 않은 값만 빼서 list.add
//		4. string으로 변환해 return
//		(3)에서 막힘. 거기부터 다시
		
		String[] numS = number.split("");		
        int[] num = Arrays.stream(numS).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(num);
        int[] deleteNum = new int[k];
        
        for(int i=0; i<k; i++) {
        	deleteNum[i] = num[i];
        }
        
        num = Arrays.stream(numS).mapToInt(Integer::parseInt).toArray(); //원래 값 얻기 위해 다시 배열화
        List<Integer> list = new ArrayList<>(); //deleteNum에 해당하지 않는 값 넣기 위한 list
        
        for(int i=0; i<num.length; i++) {
        	for(int j=0; j<k; j++) {
        		if(num[i] == deleteNum[j]) {
        			break;
        		}else {
//        			if(j == k-1) {
//        			list.add(num[i]);
//        			break;}
        		}
        	}
//        	System.out.println(list);
        }
        
        return "";
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1231234",3));
	}
}
