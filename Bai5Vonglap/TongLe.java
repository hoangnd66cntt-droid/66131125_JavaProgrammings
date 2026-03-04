package Bai5Vonglap;
import java.util.Scanner;
public class TongLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kq= 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				kq += i;
			}
		}
		System.out.println(kq);
        sc.close();
	}
}