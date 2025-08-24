import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		String[] color = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		String result = "";
		int multiply = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < color.length; j++) {
				if (str[i].equals(color[j]) && i != 2) {
					result += j + "";
				} else if (str[i].equals(color[j]) && i == 2) {
					multiply = (int) (Math.pow(10, j));
				}
			}
		}
		System.out.println(Long.parseLong(result) * multiply);
	}
}