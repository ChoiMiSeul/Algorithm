package level1;

public class GetAverage {
	/**
	 * 프로그래머스 Level 1 평균구하기
	 * https://programmers.co.kr/learn/courses/30/lessons/12944
	 * 점수 : +1
	 * 날짜 210317 ~00:13
	 */
	public static double solution(int[] arr) {
		double answer=0;
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			answer=sum/arr.length;
		}
		return answer;
	}
}
