package Math02;

import java.util.*;

public class B1978 {

	public static void main(String[] args) {
		// ���� : https://www.acmicpc.net/problem/1978
		// �˰��� ���� :
		// �׽�Ʈ ���̽�n��ŭ �Է¹޾� n�� ���ڸ� �Է¹ް� �� ���ڰ� �Ҽ����� �Ǻ��ϴ� ����
		// B2581�� ���� ������ �����̴� �� ������ �Ҽ��� Ư¡�� �˰������� ���� Ǯ �� �ִ�.
		
		Scanner in = new Scanner (System.in);
		
		// �׽�Ʈ ���̽� n
		int n = in.nextInt();
		// �Ҽ��� ���� prime
		int prime = 0;

		// �׽�Ʈ ���̽���ŭ �ݺ�
		for (int i = 1;n>=i;i++) {
			// B2581�� ���������� 2�̻� num-1���� ������ �������� �����°�� cnt����
			int num = in.nextInt();
			int cnt = 0;
			// num�� 1�� ���� ��츦 �����Ѵ�. (1�� �Ҽ��� �ƴϴ�.)
			if (num >=2) {
				// 2���� num-1���� ���ڷ� num�� ������ �������� �������� Ȯ���Ѵ�.
				for(int j = 2; num > j;j++) {
					if (num%j==0) {
						continue;
					}
					else {
						cnt++;
					}
				}
				// ���� 2�̻� num-1������ ���� ���� �������� ���� 0�� �ƴѰ�� 
				// prime (�Ҽ�) ����
				if (cnt == num-2) {
					prime++;
				}	
			}
		}
		// ��º�
		System.out.println(prime);
	}

}
