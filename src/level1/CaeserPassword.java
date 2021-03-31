package level1;

public class CaeserPassword {
	/**
	 * 프로그래머스 Level 1 시저 암호
	 * https://programmers.co.kr/learn/courses/30/lessons/12926
	 * 점수 : +4
	 * 날짜 : 210331~210401
	 */
	public static String solution(String s, int n) {
//		int[] lowAlphabet = new int[26];
//		int[] upAlphabet = new int[26];
//		for(int i=0;i<lowAlphabet.length;i++) lowAlphabet[i]=97+i;
//		for(int i=0;i<upAlphabet.length;i++) lowAlphabet[i]=65+i;
		
		String answer = "";
		char[] temp = new char[s.length()];

		for (int i = 0; i < temp.length; i++)
			temp[i] = s.charAt(i);
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] >= 65 && temp[i] <= 91) {
				if (temp[i] + n >= 91)	{
					temp[i] = (char) (temp[i] + n - 26);
				}else {
					temp[i] = (char) (temp[i] + n);
				}
			}
			if (temp[i] >= 97 && temp[i] <= 122) {
				if (temp[i] + n > 122) {
					temp[i] = (char) (temp[i] + n - 26);
				}else {
					temp[i] = (char) (temp[i] + n);
				}
			}
			answer += temp[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("z", 1));
		// System.out.println(123%26);
	}
}
