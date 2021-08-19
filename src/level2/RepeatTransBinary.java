package level2;

public class RepeatTransBinary {
	/**
	 * 프로그래머스 Level2 이진 변환 반복하기
	 * https://programmers.co.kr/learn/courses/30/lessons/70129
	 * 점수 : +1
	 * 날짜 : 210820
	 */
	public static int[] solution(String s) {
        int length = 0;
        int countZero = 0;
        int count = 0;
        
        while(length != 1) {
        	int originLength = s.length();
        	count++;
        	s = s.replaceAll("0", "");
            length = s.length();
            countZero += originLength - length;
            s = Integer.toBinaryString(length);
        }
        
        return new int[] {count, countZero};
    }

	public static void main(String[] args) {
		System.out.println(solution("1111111"));
	}
}
