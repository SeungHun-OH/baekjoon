import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		LocalDate lod = LocalDate.of(2007, Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));

		System.out.println(lod.getDayOfWeek().toString().substring(0, 3));
	}
}