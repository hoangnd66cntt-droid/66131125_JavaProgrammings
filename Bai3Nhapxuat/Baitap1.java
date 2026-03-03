package Bai3Nhapxuat;
import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double num1 = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        System.out.printf("Tổng của %.2f và %.2f là: %.2f", num1, num2, sum);
        sc.close();
}
}
