import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String eqStr = "SciComLove";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char strCh = str.charAt(i);
			char eqStrCh = eqStr.charAt(i);
			if (strCh != eqStrCh)
				count++;
		}
		System.out.println(count);
	}
}