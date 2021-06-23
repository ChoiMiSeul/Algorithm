package level2;

import java.util.Arrays;

public class Lifeboat {
	public static int solution(int[] people, int limit) {
        int count = 0;
        int min = 0;
        
        Arrays.sort(people);
        for(int max = people.length-1; min<=max; max--) {
        	if(people[min] + people[max] <= limit) {
        		min++;
        	}
        	count++;
        }
        
		return count;
    }
	
	public static void main(String[] args) {
		int[] people = {70,50,80};
		System.out.println(solution(people, 100));
	}
}
