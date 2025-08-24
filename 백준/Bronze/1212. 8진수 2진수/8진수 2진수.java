import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] binaryArr = { "000", "001", "010", "011", "100", "101", "110", "111" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length(); i++) {
			if (i == 0)
				sb.append(Integer.parseInt(binaryArr[num.charAt(i) - '0']) + "");
			else
				sb.append(binaryArr[num.charAt(i) - '0']);
		}
		System.out.println(sb);
	}
}
