package level1;

import java.util.Arrays;
import java.util.Comparator;

//210406 00:20 ~ 210407 21:30
public class FailureRate {
	/**
	 * 프로그래머스 Level 1 실패율
	 * https://programmers.co.kr/learn/courses/30/lessons/42889
	 * 점수 : +8
	 * 날짜 : 210406 00:20 ~ 210407 21:30
	 */
	public static int[] solution(int N, int[] stages) {
		// 1. 실패율 공식 : 도달했으나 클리어하지 못한 플레이어 수 / 도달한 플레이어 수
		// 2. 스테이지 개수 N, 현재 멈춰있는 스테이지 번호 담긴 배열 stage
		// 3. 실패율 높은 스테이지부터 내림차순으로 정렬하여 리턴 (같다면 작은 번호 먼저 오도록, 도달 유저 없을 경우는 0)
		int[] answer = new int[N];    
		FailureRateDataType[] fd = new FailureRateDataType[N];

		for(int i=0; i<N; i++) {
            int noClear = 0;
    		int yesClear = 0;
            
            for(int j=0; j < stages.length; j++) {
                if(i+1 == stages[j]) {
                    noClear++;
                }
                if(i+1 <= stages[j]) {
                    yesClear++;
                }
            }
            
            double failureRate = 0;
            if(yesClear == 0) {
            	fd[i] = new FailureRateDataType(i+1, 0);
            }else {
            	fd[i] = new FailureRateDataType(i+1, (double)noClear / (double)yesClear);
            }
            //System.out.println(failureRate);
            //fd[i] = new FailureRateDataType(i+1, failureRate);
        }
		Arrays.sort(fd, new Comparator<FailureRateDataType>(){
			@Override
			public int compare(FailureRateDataType arg0, FailureRateDataType arg1) {
				if(arg0.failurerate > arg1.failurerate) return -1;
				else if(arg0.failurerate < arg1.failurerate) return 1;
				else return 0;
			}
		});
		
		for(int i=0; i<N ; i++) {
			 answer[i] = fd[i].stageNum;
			 System.out.println(answer[i]);
		}
		
      return answer;
    }

	public static void main(String[] args) {
		int[] stages = {4,4,4,4};
		System.out.println(solution(4,stages));
	}
}

