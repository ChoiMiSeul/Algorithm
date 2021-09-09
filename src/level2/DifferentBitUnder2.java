package level2;

public class DifferentBitUnder2 {
	public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        char[] xArr = new char[10000000];
        char[] numArr = new char[10000000];
        
        for(int i=0; i<xArr.length; i++) {
        	xArr[i] = '0';
        	numArr[i] = '0';
        	System.out.println(xArr[i]);
        }
        
        for(int i=0; i<numbers.length; i++) {
        	int num = (int)numbers[i];
        	String xBit = Integer.toBinaryString(num);
        	int count = 0;
        	
        	for(int j=0; j<xArr.length; j++) {
//        		xArr[j] = xBit.charAt(j);
        	}
        	
        	while(true) {
        		num++;
        		String numBit = Integer.toBinaryString(num);
        		
        		for(int j=0; j<numArr.length; j++) {
//        			numArr[j] = numBit.charAt(j);
        		}
        		
        		for(int j=0; j<numArr.length; j++) {
        			if(numArr[j] != xArr[j]) count++;
        		}
        		
        		if(count <= 2) {
        			answer[i] = num;
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		long[] arr = {1,2};
		System.out.println(solution(arr));
	}
}
