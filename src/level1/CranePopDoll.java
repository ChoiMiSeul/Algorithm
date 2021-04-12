package level1;

import java.util.Stack;

public class CranePopDoll {
	/**
	 * 프로그래머스 Level 1 카카오2019 크레인인형뽑기
	 * https://programmers.co.kr/learn/courses/30/lessons/64061
	 * 점수 : +4
	 * 날짜 : 210402~05
	 */
	public static int solution(int[][] board, int[] moves) {
		// 1. 게임화면은 NxN 크기의 정사각형 격자(board)
		// 2. 인형은 가장 아래 칸부터 쌓여있음 없는 칸은 빈칸
		// 3. 사용자는 크레인을 좌우로 움직여(moves) 멈춘 위치에서 가장 위의 인형 get
		// 4. 3의 인형은 바구니에 순서대로 쌓임. 같은 인형 두개가 쌓이면 인형은 터지면서 사라짐(개수 return)
		// 5. 숫자는 인형의 모양 (같은 숫자=터짐)
		// 무브크기만큼돌려서보드인형뽑기
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		//stack.push(0);
		
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					if(!stack.empty() && board[j][moves[i]-1]==stack.peek()) {
						stack.pop();
						answer+=2;
					}else{
						stack.push(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1]=0;
					break;
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(solution(board, moves));
	}
}

/*
int answer = 0;
Stack<Integer> stack = new Stack<>();

for (int i = 0; i < moves.length; i++) {
	for (int j = 0; j < board.length; j++) {
		if (board[j][moves[i] - 1] != 0) {
			stack.add(board[j][moves[i]-1]);
			//System.out.println();
			if(!stack.empty() && ((j+1)<board.length && stack.peek()==board[j][moves[i]-1])) { //조건
				System.out.print("peek : "+stack.peek()+" "+"현재 칸: "+board[j][moves[i]-1]);
				System.out.println("sb");
				stack.pop();
				//stack.pop();
				answer+=2;
			}
			board[j][moves[i] - 1] = 0;
			break;
		}
	}
}

return answer;
*/