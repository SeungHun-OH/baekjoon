import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] str = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		long n = Long.parseLong(str[0]);
		long m = Long.parseLong(str[1]);

		System.out.println(Math.abs(n - m));

	}
}