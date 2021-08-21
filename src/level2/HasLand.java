package level2;

public class HasLand {
	// 1. 앞에서부터 최댓값이 아니라 점수가 가장 커지는 경우를 찾아야함
	// 2. 이 코드에선 1과 row값이 변하는 문제가 있음 
	static int row = 5;
	static int max;
	
	static int solution(int[][] land) {
		int sum = 0;
		
		for(int i=0; i<land.length; i++) {
			maxNum(land[i]);
			sum += max;
		}
		
		return sum;
	}
	
	public static int maxNum(int[] arr) {
		max = 0;
		for(int i=0; i<arr.length; i++) {
			if(i != row) {
				if(max < arr[i]) {
					max = arr[i];
//					System.out.println(max+" "+i);
					row = i;
				}
			}
		}
//		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(land));
	}
}
