package String;

import java.util.*;

public class B1316 {
	
	public static void main(String[] args) {
		
		// ���� : https://www.acmicpc.net/problem/1316
		// �˰��� ���� :
		// �ݺ� Ƚ����ŭ �ݺ��ϴ� �ݺ��� ���� �� ���ڿ��� �ް� �ߺ��Ǵ� ���ڿ��� �����ϰ�
		// �ٸ� ���ڿ����� ���ο� �迭�� ��ġ�Ͽ� ���Ѵ�.
		
		Scanner in = new Scanner (System.in);
		
		// �ݺ� Ƚ��
		int n = in.nextInt();
		// wordCnt��� ������ �� ���� �Է� Ƚ������
		// ���ǿ� ���� �ʴ� ���ڿ��� �����ϱ� ���� �����̴�.
		
		int wordCnt = n;
		
		for (int a = 0; n > a; a++) {
			String str = in.next();
			
			// �Է¹��� ���ڿ��� ���� ��ĵ�Ͽ� �ٸ� ��쿡�� cnt ���
			// cnt�� ���ο� �迭�� ���̸� �����ϱ� ���� �����̴�.
			int cnt = 1;
			for (int i = 0;str.length()-1 > i;i++) {
				if (str.charAt(i) != str.charAt(i+1)) {
					cnt++;
				}
			}
		
			// cnt ������ �迭 ����
			char arr [] = new char [cnt];

			// k�� ���͸��� �迭�� �������ִ� �����̴�.
			int k = 0;
			for (int i = 0;str.length() -1 > i;i++) {
				// ���ڿ��� i��° ���ڿ� i+1��° ���ڿ��� �ٸ� ��� �̸� ���� k��° k+1��° �迭�� �����Ѵ�.
				if (str.charAt(i) != str.charAt(i+1)) {
					arr[k] = str.charAt(i); arr[k+1] = str.charAt(i+1);
					k++;
				}
				//�� �ּ����� �ش��� �ȵǴ� ��� ��ŵ�Ѵ�.
				else {
					continue;
				}
			}
			// k�� �ʱ�ȭ ���ش�.
			k = 0;
			
			// for���� 2������ ����ϰ� ������ �� �ݺ��� �Ѵ� arr�迭 ��ü�� ��ĵ�ϵ�
			// i�� j ���� �������� �������� ��ĵ�Ѵ�.
			Loop: 
			for (int i = 0; arr.length-1 > i; i++) {
				for (int j = 0; arr.length>j; j++) {
					// ���� �� �ּ��� ���� �����ϸ鼭 i��° arr�迭�� j��° arr�迭�� �������
					// wordCnt���� 1�� ���ҽ�Ű�� Loop�� �ǵ��ư���.
					if (i < j && arr[i] == arr[j]) {
						wordCnt--;
						break Loop;
					}
				}
			}
		}
		System.out.println(wordCnt);
	}
}