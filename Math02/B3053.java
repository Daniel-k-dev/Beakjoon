package Math02;

import java.util.*;

public class B3053 {

	public static void main(String[] args) {
		// ���� : https://www.acmicpc.net/problem/2775
		// �˰��� ���� :
		// �ι�° ��¹��� �ڼ��� ����
		
		Scanner in = new Scanner (System.in);
		
		// n �Է�
		double n = in.nextDouble();
		
		// �������� ���� n^2x Pi
		System.out.println(n*n*Math.PI);
		
		// �������� ���ϴ� ������ n�� x��� y���� ������ ���� n�� �Ǿ���ϰ�
		// �������� ���ϴ� ���� ���Ǵ� �̿� �ش��ϴ� ������ �����̴�.
		// �� �׸��� �׸��� ������ ���簢���� ���´�.
		System.out.printf("%.6f",n*n*2);
	}

}
