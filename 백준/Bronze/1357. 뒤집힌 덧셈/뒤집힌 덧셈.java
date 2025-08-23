import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] str = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		String revX = "", revY = "";
		String result = "", tmp = "";
		for (int i = 0; i < 2; i++) {
			int num = i == 0 ? str[0].length() : str[1].length();
			String value = i == 0 ? str[0] : str[1];
			for (int j = 0; j < num; j++) {
				if (i == 0) {
					revX += value.charAt(num - 1 - j) + "";
				} else {
					revY += value.charAt(num - 1 - j) + "";
				}
			}
		}
		tmp = (Integer.parseInt(revX) + Integer.parseInt(revY)) + "";
		for (int i = 0; i < tmp.length(); i++) {
			result += tmp.charAt(tmp.length() - 1 - i);
		}
		System.out.println(Integer.parseInt(result));
	}

}
