package task_teamstudy;

import java.util.Scanner;

//1���� ������ �Է¹޾� �Ƕ�̵� ����ϱ�
public class teamtask {
	public static void main(String[] args) {
		//���ڸ� �Է¹���
		System.out.println("���ڸ� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			//��ĭ ���
			for (int j=1; j<=n-i; j++)
				System.out.print(" ");
			//�� ���
			for (int j=1; j<=2*i-1; j++)
				System.out.print("*");
				System.out.println("");
				
				scanner.close();
		}
	}
}



