package level1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TwoNumPlus {
	/**
	 * ���α׷��ӽ� Level 1 �� �� �̾Ƽ� ���ϱ�
	 * https://programmers.co.kr/learn/courses/30/lessons/68644 
	 * ���� : +6
	 * ��¥ : 210311 23:00~03:12
	 */
	public static int[] solution(int[] numbers) {
		// 1. �Է¹��� �迭���� �ΰ��� ���� ���� <-for�� ������ ��� �� ���ϱ� ���γ��� ��������
		// 2. �� ���ڸ� ���ؼ� ���� �� �ִ� ��� �� �迭�� ���� <- set�̿��ؼ� �ߺ� ����
		// 3. �������� ���� <-�����Ʈ or ArraysSort
		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j)
					set.add(numbers[i] + numbers[j]);
			}
		}
		
		return set.stream().mapToInt(Integer::intValue).toArray();

		/*ArrayList<Integer> list = new ArrayList<>(set);
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}*/
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2 };
		solution(arr);
		System.out.println("���� ��õ");
	}

}
