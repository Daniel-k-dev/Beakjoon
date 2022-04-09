package Math02;

import java.util.*;

public class B1002 {

	public static void main(String[] args) {
		// ���� : https://www.acmicpc.net/problem/1002
		// �˰��� ���� :
		// 2���� ���� ��� ���� ��ġ���� ����ϴ� ����
		// �� ������ �����ϰ� ���ǽ��� �Ȱ�ġ�� �ϴ°� �߿��� �����̴�.

		Scanner in = new Scanner (System.in);

		// �õ� Ƚ�� testcase
		int testcase = in.nextInt();
		
		for (int i = 0 ;testcase > i; i++) {
		
			// ��ǥ���� �Ÿ��� �Է�
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			
			// ��ǥ�� ��ǥ������ �Ÿ� length
			double length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			
			// ��ǥ���� �Ÿ����� ���� ���� ��� ���� �� �ִ� ���� ���� ����
			// �Ʒ��� ���ǹ��� ��ġ�� �κ��� �־� ���ǹ��� ������ �߿��ϴ�.
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}
			// �������� ���� �Ǵ� �����ϴ� ���
			else if (length == r1+r2 || length == r1-r2 || length == r2-r1) {
				System.out.println(1);
			}
			// �� ������ ���� ���� �ϰų� �ȸ����� ���
			// ��ǥ ������ �Ÿ��� ������ ��Ÿ ���� ��
			else if (r1 + r2 > length){
				// ������ ���� �ȿ� ���� �ִ°��
				if (r1 > length + r2 || r2 > length + r1) {
					System.out.println(0);
				}
				// �ƴѰ��� ���� �ȿ��� �� ���� ����
				else {
					System.out.println(2);		
				}
			}
			// ���� �ۿ��� ������ �ʴ� ���
			else {
				System.out.println(0);
			}
			
		}
		
	
	}

}
