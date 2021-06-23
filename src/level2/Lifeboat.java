package level2;

import java.util.Arrays;

public class Lifeboat {
	public static int solution(int[] people, int limit) {
        int count = 0;
        int sum = 0;
        
        Arrays.sort(people);
        for(int i=0; i<people.length; i++) {
        	sum += people[i];
        	if(sum + people[i+1] > limit) {
        		count++;
        		sum = 0;
        	}
        }
        
		return count;
    }
	
	public static void main(String[] args) {
		int[] people = {70,50,80,50};
		System.out.println(solution(people, 100));
	}
}
