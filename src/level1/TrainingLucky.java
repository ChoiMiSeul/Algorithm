package level1;

public class TrainingLucky {
	public static int solution(int n, int[] lost, int[] reserve) {
		// 1. 바로 앞번호나 뒷번호에게만 빌려줄 수 있음
		// 2. 최대한 많은 학생이 수업을 들어야함
		// 3. 전체 학생수 n, 도난 학생 배열 lost, 여벌 보유 학생 배열 reserve
		boolean[] usedReserve = new boolean[n + 1];

		for (int i = 0; i < reserve.length; i++) {
			usedReserve[reserve[i]] = true; // reserve 빌림 여부 표시 위해 boolean으로
		}
		
		for(int i = 0; i < lost.length; i++) {
			if(usedReserve[lost[i]]) {
				usedReserve[lost[i]] = false;
				lost[i] = -1;
			}
		}
		
		for(int i = 0; i < lost.length; i++) {
			if(lost[i] == -1) {
				continue;
			}
			//이전학생 탐색
			//이전 학생에서 구했으면 continue;
			//구했으면, usedReserve false로 바꿔주기
			if(lost[i] > 1 && usedReserve[lost[i] - 1]) {
				usedReserve[lost[i] - 1] = false;
				continue;
			}
			//이후학생 탐색
			if(lost[i] < n && usedReserve[lost[i] + 1]) {
				usedReserve[lost[i] + 1] = false;
				continue;
			}
			n -= 1;
		}
		
		return n;
	}

	public static void main(String[] args) {
	}
}
