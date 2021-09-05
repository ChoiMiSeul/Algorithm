package level2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossingBridge {
	/**
	 * 프로그래머스 Level2 다리를 지나는 트럭
	 * https://programmers.co.kr/learn/courses/30/lessons/42583
	 * 점수 : +2
	 * 날짜 : 210905
	 */
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int count = 0;
        int sum = 0; 
        Queue<Integer> crossing = new LinkedList<>();
        
        for(int i=0; i<truck_weights.length; i++) {
        	while(true) {
        		if(crossing.isEmpty()) {
        			crossing.add(truck_weights[i]);
        			sum += truck_weights[i];
        			count++;
        			break;
        		}else if(crossing.size() == bridge_length) {
        			sum -= crossing.poll();
        		}else {
        			if(sum + truck_weights[i] <= weight) {
        				crossing.add(truck_weights[i]);
        				sum += truck_weights[i];
        				count++;
        				break;
        			}else {
        				crossing.add(0);
        				count++;
        			}
        		}
        	}
        }
        
        return count + bridge_length;

    }
	
	public static void main(String[] args) {
		int[] a = {7,4,5,6};
		System.out.println(solution(2, 10, a));
	}
}
