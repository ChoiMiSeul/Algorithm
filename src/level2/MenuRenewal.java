package level2;

import java.util.ArrayList;
import java.util.List;

public class MenuRenewal {
	public String[] solution(String[] orders, int[] course) {
        for(int i=0; i<orders.length; i++) {
        	boolean[] visited = new boolean[orders[i].length()];
        	combinations(orders[i], visited, 0, orders[i].length());
        }
        
        return orders;
    }
	
	public static void combinations(String orders, boolean[] visited, int n, int r) {
		List<String> list = new ArrayList<>();
		
		if(r == 0) {
			for(int i=0; i<n; i++) {
				if(visited[i]) {
					list.add(orders);
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
	}
}
