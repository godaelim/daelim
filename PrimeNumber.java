import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scv = new Scanner(System.in);
		int n = scv.nextInt();
		
		// 1�� �ڱ� �ڽſܿ��� ������ �������� �ʴ� ��. �Ҽ�.
		int count = 0;
		
		for(int k=1; k<=n; k++) {
			if(n%k == 0) // 1���� 1�� �����ϸ� �Է� ���� ���� ������ �������� Ƚ���� ī��Ʈ
				count++;
		}
		
		if(count == 2)
			System.out.println(n + "�� �Ҽ�!");
		else
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
	}
}