package Math02;

import java.util.*;

public class B3009 {

	public static void main(String[] args) {
		
		// ���� : https://www.acmicpc.net/problem/3009
		// �˰��� ���� :
		// �ԷµǴ� x,y ���� �� ��ġ�� ��ǥ���� ���ϰ� �߰������� ������ 
		// ������ x,y ������ ���� ���Ͽ� ������ ��ǥ�� ���Ѵ�.
		
		Scanner in = new Scanner (System.in);
		
		// 2���� �迭 ����
		int arr [][] = new int [4][2];
		
		// 3��° ������ �Է�, ������ 4��° ���� ��� �� �����
		for (int i = 0;3 > i;i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		
		// 3���� x,y ��ǥ���� �ߺ��Ǵ� �߰��� ���� ����
		int middleNumber = 0;
		
		// ��ġ
		for (int i = 0;3 > i;i++) {
			for (int j = 0;3 > j;j++) {
				if (i != j) {
					// �迭�� x �� y ���� �� �� �ٸ���� j���� i���� �ƴ� ������ ���� �߰���
					if (arr[i][0] != arr[j][0] && arr[i][1] != arr[j][1]) {
						// �߰��� ��ġ
						for (int k = 0;3 > k;k++) {
							if (k != i && k != j) {
								// �߰��� ����
								middleNumber = k;
								// ������ ���� �� �߰��� ����
								arr[3][0] = arr[k][0];
								arr[3][1] = arr[k][1];		
							}
						}
					}
				}
			}
		}
		
		// �߰����� �ִ� ���� �ٸ��鼭 x���� ���� ��� y���� ���� ������ �迭�� ���ϰ�
		// y���� �ٸ���� x���� ���� ������ �迭�� ���Ѵ�
		for (int i = 0;3 > i;i++) {
			if (middleNumber != i) {
				if (arr[middleNumber][0] == arr [i][0]) {
					arr[3][1] += arr[i][1]-arr[middleNumber][1];
				}
				if (arr[middleNumber][1] == arr [i][1]) {
					arr[3][0] += arr[i][0]-arr[middleNumber][0];
				}
			}
		}
		
		// ��� ���
		System.out.println(arr[3][0] + " " + arr[3][1]);
		
	}
}
