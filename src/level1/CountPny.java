package level1;

public class CountPny {
	/**
	 * ���α׷��ӽ� Level 1 ���ڿ� �� P�� Y�� ���� 
	 * https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
	 * ���� : +5
	 * ��¥ : 210308
	 */

	public static boolean solution(String s) {
		// 1. P,Y ������ ������ Ʈ�� �ƴϸ� �޽�
		// 2. p,y�� �ϳ��� ������ Ʈ��
		// 3. ��ҹ��� ���� x - �ο�, ���� Ŭ����
		s=s.toLowerCase();
		int num=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='p') num++;
			if(s.charAt(i)=='y') num--;
		}
		
		return num==0 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(solution("ofof"));

	}
}
/*
 * s = s.toLowerCase();
		int numP = 0;
		int numY = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				numP++;
			} else if (s.charAt(i) == 'y') {
				numY++;
			}
		}

		if (numP == 0 && numY == 0) {
			return true;
		} else if (numP == numY) {
			return true;
		} 
		return false;
 */