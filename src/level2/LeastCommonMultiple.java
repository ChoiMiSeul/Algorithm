package level2;

public class LeastCommonMultiple {
	public static int solution(int[] arr) {
        int answer = 1;
        
        for(int i=0; i<arr.length; i++) {
        	answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
	
	static int gcd(int num1, int num2) {
		while(num2 != 0) {
			int n = num1 % num2;
			num1 = num2;
			num2 = n;
		}
		return num1;
	}
	
	static int lcm(int num1, int num2) {
		return (num1 * num2) / gcd(num1, num2);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		System.out.println(solution(arr));
	}
}
