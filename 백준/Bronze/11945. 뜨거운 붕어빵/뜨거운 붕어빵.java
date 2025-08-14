import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nmStr = sc.nextLine().split(" ");
		int n = Integer.parseInt(nmStr[0]);
		int m = Integer.parseInt(nmStr[1]);
		char[][] result = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++)
				result[i][j] = str.charAt(m - 1 - j);
		}
		for (char[] c : result)
			System.out.println(c);

	}
}