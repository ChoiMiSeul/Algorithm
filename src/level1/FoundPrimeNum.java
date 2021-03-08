package level1;

public class FoundPrimeNum {
	/**
	 * ���α׷��ӽ� Level 1 �Ҽ�ã��
	 * https://programmers.co.kr/learn/courses/30/lessons/12921
	 * ���� : +12
	 * �ۼ� ��¥ : 210308
	 */
	public static int solution(int n) {
		//1. �ڿ��� �Է�
		//2. 1���� �Է°� ������ ���� �� �Ҽ��� ���
		int answer=0;
		
		for(int i=2;i<=n;i++) { //2���� n����
			boolean flag=true; //��� Ʈ��
			for(int j=2;j<Math.sqrt(i);j++) { //2���� i����
				if(i%j==0) { //���� ���� 2���� ���� �������� ���� �������� 0�̸�
					flag=false; //�� �� ����
					break;
				}
			}
			if(flag==true)	answer++;
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		solution(10);
		//System.out.println(solution(10));
	}
}
