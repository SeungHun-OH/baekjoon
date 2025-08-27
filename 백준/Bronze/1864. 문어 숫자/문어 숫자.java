import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] chArr = { '-', '\\', '(', '@', '?', '>', '&', '%', '/' };
		while (true) {
			String str = br.readLine();
			if (str.equals("#"))
				break;
			int result = 0;

			for (int i = str.length() - 1, j = 0; 0 <= i; i--, j++) {
				int loc = String.valueOf(chArr).indexOf(str.charAt(j));
				loc = loc == 8 ? -1 : loc;
				result += (int) (Math.pow(8, i) * loc);
			}
			System.out.println(result);
		}
	}
}
