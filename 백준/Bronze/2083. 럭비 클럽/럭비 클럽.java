import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] str = br.readLine().split(" ");
			String name = str[0];
			int age = Integer.parseInt(str[1]), weight = Integer.parseInt(str[2]);
			if ("#00".equals(str[0] + str[1] + str[2]))
				break;
			System.out.println(age > 17 || 80 <= weight ? name + " Senior" : name + " Junior");
		}
	}
}