package Math02;

import java.util.*;

public class B2581 {

	public static void main(String[] args) {
		
		// ���� : https://www.acmicpc.net/problem/2581
		// �˰��� ���� :
		// �ּҰ��� �ִ밪�� �Է¹޾� �� ���̿� �Ҽ��� ã�Ƴ��� �� �Ҽ��� �ּҰ��� ã�Ƴ��� �Ҽ����� ���� ����ϴ� ���α׷�
		// �Ҽ��� 1�� �ڱ��ڽŸ��� �ּҰ������ �� �̴�. �� 2�̻� �����ڽ�-1���� �������� �� ���� �������� 0�� �ƴϿ��� �Ѵ�.
		
		Scanner in = new Scanner (System.in);
		
		// �Էº�
		// �Ҽ� ���� �Էº�
		int min = in.nextInt();
		int max = in.nextInt();
		
		// �հ� �Ҽ��� ���� ����
		int sum = 0;
		int prime = 0;
		
		// min���� max���� ��ĵ
		for (int m = max ;min <= m; m--) {
			// cnt == �������� ���ð�� ����
			int cnt=0;
			// 2 �̻��� ���� ������ �� �ش� �� �̸� ����
			for (int j = 2 ;m > j; j++) {
				if (m % j == 0) {
					continue;
				}
				else {
					cnt ++;
				}
			}
			// ���� cnt�� 2���� �ش� �� -1 ���� �������� ���´ٸ� �Ҽ��̹Ƿ�
			// sum�� prime�� ���� ������ �����Ѵ�.
			if (cnt == m-2) {
				sum += m;
				prime = m;
			}
		}
		
		// ��º�
		// �� �ݺ������� cnt�� �ش�� -2�� ���� �ʴٸ� prime���� 0 �̹Ƿ� -1 ���
		if (prime == 0) {
			System.out.println(-1);
		}
		// �װ� �ƴ϶�� sum�� prime�� ����Ѵ�.
		else {
			System.out.println(sum);
			System.out.println(prime);
		}
	}
}
