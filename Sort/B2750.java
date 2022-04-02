package Sort;

import java.util.*;

public class B2750 {

	public static void main(String[] args) {
		

		// ���� : https://www.acmicpc.net/problem/2750
		// �˰��� ���� :
		// �ִ��ּҸ� �Ǻ� �� �ִ밪�� ���ο� �迭�� �ְ� ���� ���� �迭�� �ִ밪�� �ּҰ��� �־�
		// �ݺ��Ͽ� �ִ밪�� ���ο� �迭�� �����ϴ� �˰���
		
		Scanner in = new Scanner(System.in);
		
		// �Է¹��� ������ �� �Է� 
		int n =  in.nextInt();
		
		// �Է¹��� �迭
		int arr [] = new int [n];
		// �Է¹��� �迭�� ��迭 �� �迭
		int arr2 [] = new int [n];

		// arr �迭�� ���� �Է�
		for (int i = 0; n > i; i++) {
			arr[i] = in.nextInt();
		}
		
		// �迭�� �ִ� �ּ� ����
		int max = arr[0]; 
		int min = arr[0];
		
		// m�� arr�迭�� �ִ밪�� �迭��
		int m = 0;
		int arrlen = arr.length-1;
		
		// arr�迭�� ���̸�ŭ �ݺ�
		for (int j = 0; arr.length > j; j++) {
			max = arr[0];
			min = arr[0];
			// �ִ��ּҰ��� arr�迭�� 0��° �ε����� ���� �� �ִ밪�� ������
			// arr�� �ִ밪�� �ڸ��� �ּҰ��� �ְ� arr2�迭�� �ִ밪�� ���ο� �迭�� ����
			for (int i = 0; arr.length > i; i++) {
				if (max <= arr[i] ) {
					max = arr[i]; 
					m = i;
				}
				else if (arr[i] <= min ) {
					min = arr[i]; 
				}
			}
			
			arr2 [arrlen] = max;
			arr[m] = min;
			arrlen--;
		}
		
		// ��º�
		for (int j = 0; arr2.length > j; j++) {
			System.out.println(arr2[j]);
		}
	}

}
