package level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Printer {
	/**
	 * 프로그래머스 Level 2 프린터
	 * https://programmers.co.kr/learn/courses/30/lessons/42587
	 * 점수 : +3
	 * 날짜 : 210503~4
	 */
	public static int solution(int[] priorities, int location) {
		//문제 정의
		// 1. 가장 앞에 있는 문서를 대기목록에서 빼고
		// 2. 뒤에 1보다 중요도가 높은 문서가 있으면 1을 맨 뒤로 보내고 아니면 1인쇄
		// 3. 중요도 담긴 배열 pri와 요청한 문서의 위치 location
		// 4. 내가 요청한 문서가 몇번째로 인쇄되는지 출력

//		문제 해결
//		1. 큐에 배열값 삽입
//		2. 큐의 peek랑 배열과 비교해서 배열에 더 큰 값이 있다면 peek가 그 값과 같을 때까지 맨 뒤로 보냄(빼고 추가)
//		// 3. 없다면 count++ ㄴㄴㄴㄴㄴxxxx
        int count = 1;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        //우선순위 큐. 값이 큰 순서대로 삽입
        
        for(int i=0; i<priorities.length; i++) {
        	queue.add(priorities[i]); //배열을 큐에 넣기
        }
        
        while(!queue.isEmpty()) {
        	for(int i=0; i<priorities.length; i++) {
            	if(priorities[i] == queue.peek()) {
            		if(location == i) {
            			return count;
            		}
            		count++;
            		queue.remove();
            	}
            }
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 2};
		System.out.println(solution(a,2));
	}
}

/**
int count = 1;

Queue<Integer> queue = new LinkedList<>();

for(int i=0; i<priorities.length; i++) {
	queue.add(priorities[i]);
}

for(int i=0; i<priorities.length; i++) {
	if(queue.peek() < priorities[i]) {
		while(queue.peek() != priorities[i]) {
			for(int j=0; j<i; j++) {
				if(location == i) {
					return count;
				}
				queue.remove();
				queue.add(priorities[j]);
				count++;
			}
		}
	}
}

return count;
**/