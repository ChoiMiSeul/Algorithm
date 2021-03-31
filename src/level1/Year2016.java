package level1;

public class Year2016 {
	/**
	 * 프로그래머스 Level 1 2016년
	 * https://programmers.co.kr/learn/courses/30/lessons/12901
	 * 점수 : +6?
	 * 날짜 : 210330
	 */
	public String solution(int a, int b) {
		int[] years = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int sumDay = 0;

		if (a != 1) {
			for (int i = 0; i < a - 1; i++) {
				 sumDay+=years[i];
			}
		}
		sumDay+=b;

		return day[sumDay % 7];
	}
}

/*
1. 2016년은 윤년. (2월의 날이 다른 해와 다름)

윤년 조건이 있음, ->해가 4로 나누어 떨어지면 윤년 , 100으로 안떨어 져야함 z, 400으로 나누어 떨어지면 윤년 

if : (해 % 4 == 0 && 해 % 100 != 0) || 해 % 400 == 0) 

2월달에 는 위 계산식이으로 품


1월 1일은 금요일
1~12월마다 일 수가 다릊낳아.
1월 부0 12월까지 일수를 저장 해놔야될꺼여같아
계산식 
{31,2월,31,30,31,30,31,31,30,31,30 ,31}

a== 2 ->2월

{THU,FRI,SAT,SUN,MON,TUE,WED,}

월+일을 합친  수 구해. 
1일 -> 금     1 % 7 = 1
7일 -> 	      7 % 7 = 0 
해[366 % 7 ]-> 
*/