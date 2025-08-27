import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]), b = Integer.parseInt(arr[1]);
		int count = 0, sum = 0;
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				if (a <= count && count <= b) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}
}