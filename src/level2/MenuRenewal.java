package level2;

import java.util.ArrayList;
import java.util.List;

public class MenuRenewal {
	public static String[] solution(String[] orders, int[] course) {
        for(int i=0; i<orders.length; i++) {
        	boolean[] visited = new boolean[orders[i].length()];
        	combinations(orders[i], visited, 0, orders[i].length());
        }
         
        return orders;
    }
	
	public static void combinations(String orders, boolean[] visited, int n, int r) {
		List<String> list = new ArrayList<>();
		
		if(r == 0) {
			for(int i=0; i<orders.length(); i++) {
				if(visited[i]) {
					list.add(orders);
					System.out.print(orders + " ");
				}
			}
			return;
		}else {
			for(int i = n; i<orders.length(); i++) {
				visited[i] = true;
				combinations(orders, visited, i+1, r-1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		String[] o = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] c = {2,3,4};
		
		System.out.println(solution(o,c));
	}
}
