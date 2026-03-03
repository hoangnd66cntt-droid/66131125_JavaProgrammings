package Bai2KieuDulieu;
import java.util.Scanner;
public class Btvn3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("--- GIAI PHUONG TRINH AX + B = 0 ---");
        System.out.print("Nhap he so a: ");
        double a = cin.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = cin.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Phuong trinh co nghiem x = %.2f\n", x);
        }
        cin.close();
    }
}
