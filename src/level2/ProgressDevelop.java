package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProgressDevelop {
	/**
	 * 프로그래머스 Level 2 기능개발
	 * https://programmers.co.kr/learn/courses/30/lessons/42586
	 * 점수 : +2
	 * 날짜 : 210511
	 */
	public static int[] solution(int[] progresses, int[] speeds) {
		// 각 기능의 진도가 100일 때 반영 가능
		// 개발 속도는 모두 달라 뒤에 있는 기능이 먼저 개발될 수 있으나 앞의 기능 배포시 함께 배포됨
		// 개발 완성도 progresses, 개발 속도 speeds. 각 배포마다 몇개의 기능이 배포되는지 return
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        for(int i=0; i<progresses.length; i++) {
        	queue.add((int) Math.ceil((double)(100-progresses[i])/speeds[i]));
        }
        
        int max = queue.poll();
        
        while(!queue.isEmpty()) {
        	if(max >= queue.peek()) {
        		count++;
        		queue.remove();
        	}else {
        		list.add(count);
        		count=1;
        		max = queue.poll();
        	}
        }list.add(count);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

	public static void main(String[] args) {
		int[] a = {95, 90, 99, 99, 80, 99};
		int[] b = {1, 1, 1, 1, 1, 1};
		System.out.println(solution(a,b));
	}
}