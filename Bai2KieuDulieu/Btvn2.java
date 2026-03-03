package Bai2KieuDulieu;
import java.util.Scanner;

public class Btvn2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
         double TY_GIA_USD = 23.500;
         double TY_GIA_EUR = 27.000;
        System.out.println("1. USD sang VND");
        System.out.println("2. EUR sang VND");
        int chon = cin.nextInt();
        System.out.print("Nhập số tiền ngoại tệ: ");
        double ngoaiTe = cin.nextDouble();
        double vnd = 0;
        if (chon == 1) {
            vnd = ngoaiTe * TY_GIA_USD;
            System.out.printf("%.2f USD = %,.0f VND\n", ngoaiTe, vnd);
        } else if (chon == 2) {
            vnd = ngoaiTe * TY_GIA_EUR;
            System.out.printf("%.2f EUR = %,.0f VND\n", ngoaiTe, vnd);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
        cin.close();
    }
}