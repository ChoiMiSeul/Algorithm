package level2;

public class MakeALargeNumber {
	/**
	 * 프로그래머스 Level2 큰 수 만들기
	 * https://programmers.co.kr/learn/courses/30/lessons/42883
	 * 점수 : +7
	 * 날짜 : 210818
	 */
	public static String solution(String number, int k) {
		StringBuilder sb = new StringBuilder();
		int idx = 0; //안에 for문을 시작할 시작점
		int max = 0;
		
		for(int i=0; i<number.length()-k; i++) { // 만들 문자 크기
			for(int j=idx; j<=k+i; j++) {
				if(max < number.charAt(j)-'0') { // 최댓값이 현재 값보다 작으면
					max = number.charAt(j)-'0'; //-'0' : char를 정수형으로 변환
					idx = j+1; // 찾은값 한칸 뒤부터 순회
				}
			}
			sb.append(max); //max값 합체
			max = 0; //max 초기화
		}return sb.toString(); 
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1924",2));
	}
}
