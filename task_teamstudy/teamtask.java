package task_teamstudy;

import java.util.Scanner;

//1개의 정수를 입력받아 피라미드 출력하기
public class teamtask {
	public static void main(String[] args) {
		//숫자를 입력받음
		System.out.println("숫자를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			//빈칸 출력
			for (int j=1; j<=n-i; j++)
				System.out.print(" ");
			//별 출력
			for (int j=1; j<=2*i-1; j++)
				System.out.print("*");
				System.out.println("");
				
				scanner.close();
		}
	}
}



