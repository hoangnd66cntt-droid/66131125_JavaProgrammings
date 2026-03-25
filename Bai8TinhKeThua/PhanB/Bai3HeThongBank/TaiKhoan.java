package Bai8TinhKeThua.PhanB.Bai3HeThongBank;
public class TaiKhoan {
    protected String soTaiKhoan;
    protected String tenChuTaiKhoan;
    protected double soDu;
    public TaiKhoan(String stk, String ten, double soDu) {
        this.soTaiKhoan = stk;
        this.tenChuTaiKhoan = ten;
        this.soDu = soDu;
    }
    public void guiTien(double soTien) {
        if (soTien > 10000) {
            this.soDu += soTien;
            System.out.println("Gui tien thanh cong: +" + String.format("%,.0f", soTien));
        }
    }
    public void rutTien(double soTien) {
        if (soTien > 10000 && soTien <= soDu) {
            this.soDu -= soTien;
            System.out.println("Rut tien thanh cong: -" + String.format("%,.0f", soTien));
        } else {
            System.out.println("So du khong du hoac so tien khong hop le!");
        }
    }
    public void hienThiThongTin() {
     
        System.out.println("STK: " + soTaiKhoan);
        System.out.println("Chu TK: " + tenChuTaiKhoan);
        System.out.println("So du: " + String.format("%,.0f", soDu) + " VND");
    }
}