package level2;

import java.util.PriorityQueue;

public class MoreSpicy {
	/**
	 * 프로그래머스 Level 2 더 맵게
	 * https://programmers.co.kr/learn/courses/30/lessons/42626#qna
	 * 점수 : +8
	 * 날짜 : 210507 50m
	 */
	public static int solution(int[] scoville, int K) {
		int count = 0;
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		for(int i=0; i<scoville.length; i++) {
			heap.add(scoville[i]);
		}
		
		for(int i=0; i<scoville.length; i++) {
			while(heap.peek() <= K) {
				int num = heap.poll();
				heap.add(num + (heap.poll()*2));
				count++;
				if(heap.size() == 1 && heap.peek() <= K) {
					return -1;
				}
			}
		}
		
		return count;
    }

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		System.out.println(solution(a,11));
	}
}
