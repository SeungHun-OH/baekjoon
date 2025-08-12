import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
	}
}
