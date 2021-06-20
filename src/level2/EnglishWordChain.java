package level2;

import java.util.HashSet;
import java.util.Set;

public class EnglishWordChain {
	/**
	 * 프로그래머스 Level2 영어 끝말잇기
	 * https://programmers.co.kr/learn/courses/30/lessons/12981
	 * 점수 : +3
	 * 날짜 : 210620
	 */
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char w = ' ';
        
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        w = words[0].charAt(words[0].length()-1);
        
        for(int i=1; i<words.length; i++) {
        	if(words[i].charAt(0) == w && !set.contains(words[i]) && words[i].length() != 1) {
        		w = words[i].charAt(words[i].length()-1);
        		set.add(words[i]);
        	}else {
        		answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
        		answer[1] = i / n + 1;
        		return answer;
        	}
        }
        
        System.out.println(answer[0]+" "+answer[1]);
        
        return new int[] {0,0};
    }

	public static void main(String[] args) {
		String[] a = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(solution(2,a));
	}
}
