import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		boolean[] ball = { true, false, false };

		for (int i = 0; i < m; i++) {
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]) - 1, y = Integer.parseInt(str[1]) - 1;
			boolean tmp = false;
			tmp = ball[x];
			ball[x] = ball[y];
			ball[y] = tmp;
		}
		for (int i = 0; i < ball.length; i++) {
			if (ball[i])
				System.out.println(i + 1);
		}

	}
}
