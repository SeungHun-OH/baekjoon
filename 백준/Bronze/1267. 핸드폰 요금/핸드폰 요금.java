import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		int y = 0;
		int m = 0;
		for (int i = 0; i < n; i++) {
			int charge = Integer.parseInt(str[i]);
			y += (charge / 30 + 1) * 10;
			m += (charge / 60 + 1) * 15;
		}
		System.out.println(y > m ? "M " + m : y == m ? "Y M " + y : "Y " + y);
	}
}