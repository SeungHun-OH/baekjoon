import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] basket = new int[4];
		for (int i = 0; i < basket.length; i++)
			basket[i] = sc.nextInt();
		int sumA = basket[0] + basket[3];
		int sumB = basket[1] + basket[2];
		System.out.println(sumA > sumB ? sumB : sumA);
	}
}