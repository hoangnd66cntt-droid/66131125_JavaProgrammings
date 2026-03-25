package Bai8TinhKeThua.PhanB.Bai3HeThongBank;
public class TaiKhoanTietKiem extends TaiKhoan {
    private int kyHan;
    private double laiSuat;


    public TaiKhoanTietKiem(String stk, String ten, double soDu, int kyHan, double laiSuat) {
        super(stk, ten, soDu);
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }
    public double tinhLai() {
        return soDu * (laiSuat/100)*(kyHan/12);
    }
    @Override
    public void rutTien(double soTien) {
        System.out.println("Loi:Day la tai khoan tiet kiem ky han " + kyHan + " thang. Khong duoc rut truoc han!");
    }
}