package Sort;

import java.util.*;

public class B1427 {

	public static void main(String[] args) {
		// ���� : https://www.acmicpc.net/problem/1427
        // �˰��� ���� :
        // �Է¹��� ���� �ݴ�� �����ϴ� �����̴�.
		
		Scanner in = new Scanner (System.in);
		
		// �Է¹޴� ��
		int n = in.nextInt();
	
		
		int n1 = n;
		// ���� ���̸� ī��Ʈ �ϴ� ����
		int cnt = 1;
		
		// n�� 10�̻��ϴ� 10���� ������ ī��Ʈ�� �ø���.
		while (n >= 10) {
			cnt++;
			n /=10;
		}
		
		// ������ �迭		
		int arr [] = new int [cnt];
		// ������ �迭�� �ݴ�� �迭�� �迭
		int arr1 [] = new int [cnt];
		
		// �迭�� �� �ڸ����� ���� ����
		for (int i = 0;arr.length>i;i++) {
			arr[i] = n1%10;
			n1 /= 10;
		}
		
		// ���� (�����Լ�)
		Arrays.sort(arr);
		
		// ������ �迭�� ������ �迭�� �迭�� �ݴ�� ����
		int j = 0;
		for (int i = arr.length-1;0<=i;i--) {
			arr1[j] = arr[i];
			j++;
		}
		
		// ��º�
		for (int i = 0;arr.length>i;i++) {
			System.out.print(arr1[i]);
		}
	}

}
