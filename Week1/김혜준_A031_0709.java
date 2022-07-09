import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;

		count = (n-1) + n*(m-1);//자르는 횟수는 각 줄마다 칸수-1 이다.
		System.out.println(count);

	}

}