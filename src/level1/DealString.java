package level1;

public class DealString {
	/**
	 * ���α׷��ӽ� Level 1 ���ڿ� �ٷ�� �⺻
	 * https://programmers.co.kr/learn/courses/30/lessons/12918
	 * ���� : +11
	 */
	public static boolean solution(String s) {
		//1. s�� ���̴� 4 or 6
		//2. ���ڷ� ���� �Ǿ������� True, �ƴϸ� False
		boolean answer=true;
		
		byte[] arr=s.getBytes();
		
		if(s.length()==4 || s.length()==6) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(arr[i]>=48 && arr[i]<=57) count++;
				else return false;
			}return true;
		}return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("134a"));
	}
}