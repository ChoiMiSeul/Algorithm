package level1;

import java.util.Scanner;

public class RectangleStar {
	/**
	 * 프로그래머스 Level 1 직사각형 별찍기
	 * https://programmers.co.kr/learn/courses/30/lessons/12969 
	 * 점수 : +1 
	 * 날짜 : 210318 21:56~
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
