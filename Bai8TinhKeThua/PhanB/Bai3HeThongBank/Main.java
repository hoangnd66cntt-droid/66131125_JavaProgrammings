package Bai8TinhKeThua.PhanB.Bai3HeThongBank;

public class Main {
    public static void main(String[] args) {
        TaiKhoanTietKiem tkTk = new TaiKhoanTietKiem("TK001", "Nguyen Thanh N", 100000000, 12, 6.5);
        tkTk.hienThiThongTin();
        System.out.println("Tien lai du kien: " + String.format("%,.0f", tkTk.tinhLai()));
        tkTk.rutTien(1000000);
    }
}