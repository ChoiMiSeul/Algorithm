package level2;

public class DifferentBitUnder2 {
	/**
	 * 프로그래머스 Level2 2개 이하로 다른 비트
	 * https://programmers.co.kr/learn/courses/30/lessons/77885
	 * 점수 : +12
	 * 날짜 : 210913
	 */
	public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	String binary = "0" + Long.toBinaryString(numbers[i]);
        	StringBuilder result = new StringBuilder(binary);
        	
        	int lastZero = result.lastIndexOf("0");
        	result.setCharAt(lastZero, '1');
        	
        	if(numbers[i] % 2 == 1) {
        		result.setCharAt(result.indexOf("1", lastZero+1), '0');
        	}
        	
        	answer[i] = Long.parseLong(result.toString(), 2);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		long[] arr = {2,7};
		System.out.println(solution(arr));
	}
}
