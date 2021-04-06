package level1;

public class RecommendNewId {
	/**
	 * 프로그래머스 Level 1 신규 아이디 추천
	 * https://programmers.co.kr/learn/courses/30/lessons/72410
	 * 점수 : +4 
	 * 날짜 : 210405
	 */
	public static String solution(String new_id) {
		// 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디 추천
		// 1. 3자 이상 15자 이하
		// 2. 소문자, 숫자, -, _, .만 사용 가능 단, 마침표는 처음과 끝 그리고 연속으로 사용 불가능
		// 대문자는 소문자 치환 / 2번에 없는 문자 모두 제거 / 마침표 두개는 한개로
		// 마침표 처음과 끝은 제거 / 비었다면 a대입 / 16자 이상 문자 제거 / 제거 후 마침표가 뒤에 온다면 제거
		// 2글자 이하라면 마지막 문자를 길이 3이 될 때까지 삽입
		String answer = "";
		new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		new_id = new_id.replaceAll("[.]+", ".");
		new_id = new_id.charAt(0) == '.' ? new_id.substring(1) : new_id;
		new_id = new_id.length() !=0 && new_id.charAt(new_id.length()-1) == '.' ? new_id.substring(0,new_id.length()) : new_id;
		new_id = new_id.equals("") ? "a" : new_id;
		new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;
		new_id = new_id.charAt(new_id.length()-1) == '.' ? new_id.substring(0,new_id.length() - 1) : new_id;
		while(new_id.length()<3) {
			new_id += new_id.charAt(new_id.length()-1);
		}
	
		return new_id;
	}

	public static void main(String[] args) {
		System.out.println(solution("z-+.^."));
	}
}