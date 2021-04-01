package level1;

public class SecretMap {
	/**
	 * 프로그래머스 Level 1 카카오2018 - 비밀지도
	 * https://programmers.co.kr/learn/courses/30/lessons/17681
	 * 점수 : +2
	 * 날짜 : 210401 22:17 ~ 02:10
	 */
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		//1. 지도 한 변의 길이가 n > 배열의 크기가 n
		//2. 공백과 벽#으로 이루어져 있고 공백은 0 벽은 1. n만큼 2진수로 나타내져 10진수 값을 가지고 있음
		//3. 지도 1과 2를 겹쳐 하나라도 벽(1)인 부분은 모두 벽(1) > 모두 공백이어야 함
		//4. arr1과 2 해독하여 지도형태(공백과 #)로 나타내 출력
		
		int[] result=new int[n];
		String[] answer= new String[n];
		
		for(int i=0 ; i<n; i++) {
			answer[i]=String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i]|arr2[i]))).replaceAll("0", " ").replaceAll("1", "#");
		}
	
		return answer;
	}

	public static void main(String[] args) {
		int[] arr1={46, 33, 33 ,22, 31, 50};
		int[] arr2={27 ,56, 19, 14, 14, 10};
		
		System.out.println(solution(6,arr1,arr2));
	}
}
