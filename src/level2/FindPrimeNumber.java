package level2;

public class FindPrimeNumber {
	public static int solution(String numbers) {
        int answer = 0;
        int[] num = new int[numbers.length()];
        
        //numbers의 숫자 각각 int형으로 바꿔서 배열에 저장
        for(int i=0; i<numbers.length(); i++) {
        	num[i] = Character.getNumericValue(numbers.charAt(i));
        }
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("17"));
	}
}
