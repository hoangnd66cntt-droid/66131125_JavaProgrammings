package Baitap_OOP.BT_Sp;
import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giamGia;
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sanpham: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = scanner.nextDouble();
    }
    public void xuat() {
        System.out.println("---------------------------");
        System.out.println("Ten sanpham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}