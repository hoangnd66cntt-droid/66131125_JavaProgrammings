package Bai8TinhKeThua.PhanB.Bai3HeThongBank;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double hanMucRut;
    private double phiGiaoDich;

    public TaiKhoanThanhToan(String stk, String ten, double soDu, double hanMuc, double phi) {
        super(stk, ten, soDu);
        this.hanMucRut = hanMuc;
        this.phiGiaoDich = phi;
    }
    @Override
    public void rutTien(double soTien) {
        double tongTien = soTien + phiGiaoDich;
        if (soTien > hanMucRut) {
            System.out.println("Vuot qua han muc rut (" + hanMucRut + ")");
        } else if (tongTien > soDu) {
            System.out.println("So du khong du de thanh toan ca phi giao dich");
        } else {
            this.soDu -= tongTien;
            System.out.println("Rut thanh cong: " + soTien + " (Phi: " + phiGiaoDich + ")");
        }
    }

    public void thanhToanHoaDon(String loaiHoaDon, double soTien) {
        System.out.print("Thanh toan hoa don " + loaiHoaDon + ": ");
        this.rutTien(soTien);
    }
}