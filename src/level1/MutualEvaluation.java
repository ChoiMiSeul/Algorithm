package level1;

public class MutualEvaluation {
	public static String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        
        for(int i=0; i<scores.length; i++) {
        	int max = 0;
    		int min = 100;
            int div = scores.length;
            boolean sameScore = false;
            
        	for(int j=0; j<scores[i].length; j++) {
        		if(scores[i][i] == scores[j][i]) {
        			sameScore = true;
        		}
        		
        		if(scores[j][i] > max) max = scores[j][i];
        		if(scores[j][i] < min) min = scores[j][i];
        		
        		if(i == j) {
        			if(!sameScore && scores[j][i] >= max || scores[j][i] <= min) {
        				div--;
        				continue;
        			}
        		}
        		sum += scores[j][i];
        	}
        	
    		if(sum / div >= 90) sb.append("A");
    		else if(sum / div >= 80 && sum / div < 90) sb.append("B");
    		else if(sum / div >= 70 && sum / div < 80) sb.append("C");
    		else if(sum / div >= 50 && sum / div < 70) sb.append("D");
    		else sb.append("F");
    		
    		sum = 0;
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
//		int[][] arr = {{100, 90, 98, 88, 65},{50, 45, 99, 85, 77},{47, 88, 95, 80, 67},{61, 57, 100, 80, 65},{24, 90, 94, 75, 65}};
		int[][] arr = {{75,50,100},{75,100,20},{100,100,20}}; //BBF
		System.out.println(solution(arr));
	}
}
