package level2;

public class Carpet {
	/**
	 * 프로그래머스 Level2 카펫
	 * @param brown
	 * 점수 : +2
	 * 날짜 : 210630
	 */
	public static int[] solution(int brown, int yellow) {
		int x = 0; // 가로
		int y = 0; // 세로

		for (y = 3; y <= (brown + 4) / 2 ; y++) {
			x = (brown + 4) / 2 - y;
			if (x < y | (x - 2) * (y - 2) == yellow) break;
		}
		
		System.out.println(x+" "+y);

		return new int[] { x, y };
	}

	public static void main(String[] args) {
		System.out.println(solution(24, 24));
	}
}