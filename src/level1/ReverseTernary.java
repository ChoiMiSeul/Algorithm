package level1;

public class ReverseTernary {
	/**
	 * ���α׷��ӽ� Level 1 3���� ������ 
	 * https://programmers.co.kr/learn/courses/30/lessons/68935
	 * ���� : 
	 */
	public int solution(int n) {
		// 1. 10������ 3������ ��ȯ
		// 2. 3���� ������
		// 3. 10���� �ٽ� ��ȯ
		String reverse="";
		
		while(n>=3) {
			reverse+=(n%3);
			n=n/3;
		}
		reverse=reverse+n;
		
	    int answer = Integer.parseInt(reverse.toString(), 3);    //3���� to 10����
		return answer;
	}

	public static void main(String[] args) {
	}
}
