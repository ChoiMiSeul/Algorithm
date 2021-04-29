package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MockTest {
	/**
	 * 프로그래머스 Level 1 모의고사
	 * 날짜 : 210428 
	 */
	public static int[] solution(int[] answers) {
		// 1번 수포자는 1234512345 2번은 21232425 3번은 3311224455
		// 정답 들은 배열 answer, 가장 많이 맞힌 사람이 누군지 return. 여럿이면 오름차순
        int[] num1Size = new int[answers.length];
        int[] num2Size = new int[answers.length];
        int[] num3Size = new int[answers.length];
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0; i<answers.length; i++) {
        	num1Size[i] = num1[i % 5];
        	num2Size[i] = num2[i % 8];
        	num3Size[i] = num3[i % 10];
        } 
        
        for(int i=0; i<answers.length; i++) {
           	if(num1Size[i]==answers[i]) count1++;
           	if(num2Size[i]==answers[i]) count2++;
           	if(num3Size[i]==answers[i]) count3++;
        }
        
        List<Integer> answer = new ArrayList<>();
        // 세개 비교해서 제일 큰 값 리스트에 추가
        // 큰 값과 같으면 그 같은 값도 추가
        
        int max = count1;
        if(count2 > max) max = count2;
        if(count3 > max) max = count3;
        
        if(max==count1) answer.add(1);
        if(max==count2) answer.add(2);
        if(max==count3) answer.add(3);
        
        System.out.println(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
	
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		System.out.println(solution(answers));
	}
}