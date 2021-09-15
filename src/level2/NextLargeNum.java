package level2;

public class NextLargeNum {
	public static int solution(int n) {
		int count1 = Integer.bitCount(n);
        while(true) {
        	n++;
        	if(count1 == Integer.bitCount(n)) {
        		return n;
        	}
        }
    }

	public static void main(String[] args) {
		System.out.println(solution(15));
	}
}
