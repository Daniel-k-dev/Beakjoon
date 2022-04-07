package Math02;

import java.util.*;

public class B2775 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		// ���� : https://www.acmicpc.net/problem/2775
		// �˰��� ���� :
		// k�� nȣ ���� k-1 , n ȣ ������ �迭�� ����� �������� k�� nȣ�� �� �ο����� ����Ѵ�.
		
		// �׽�Ʈ ���̽� T
		int T = in.nextInt();
		
		// �ݺ�
		for (int i = 0; T > i; i++) {
			// k��
			int k = in.nextInt();
			// nȣ
			int n = in.nextInt();
			
			// k*nũ���� 2���� �迭 (1���� �ƴ� 0 ������ �־ k-1�� �ƴ϶� k�̴�.)
			int arr [][] = new int [k][n];

			// 0 �� ����
			int sum = 1;
			for (int j = 0; n > j; j++) {
				arr[0][j] = sum;
				sum++;
			}
				
			// ����
			sum = 0;
			for (int j = 1; k > j; j++) {
				// ȣ���� �ο� ��
				for (int l = 0; n > l; l++) {
					sum += arr[j-1][l];
					arr[j][l] = sum;
				}	
				// �ʱ�ȭ 
				sum = 0;
			}
			
			// ��� ��º�
			int result = 0;
			for (int l = 0; n > l; l++) {
				result += arr[k-1][l];
			}
			System.out.println(result);  
		}
		
	}
}
