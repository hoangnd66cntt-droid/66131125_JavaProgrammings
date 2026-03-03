package Bai2KieuDulieu;
import java.util.Scanner;

public class Btvn1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        double gioLam = cin.nextDouble();
        System.out.print("Nhập lương mỗi giờ: ");
        double luongGio = cin.nextDouble();
        double tongLuong;
        if (gioLam <= 40) {
            tongLuong = gioLam * luongGio;
        } else {
            double gioTieuchuan = 40;
            double gioTangCa = gioLam - 40;
            tongLuong = (gioTieuchuan * luongGio) + (gioTangCa * luongGio * 1.5);
        }
        System.out.printf("Tổng lương nhân viên nhận được là: %.2f\n", tongLuong);
        cin.close();
    }
}