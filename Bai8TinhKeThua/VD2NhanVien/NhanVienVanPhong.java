package Bai8TinhKeThua.VD2NhanVien;

public class NhanVienVanPhong extends NhanVien {
    private int soGioLamViec;
    private double tienPhuCap;

    public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, int soGioLamViec, double tienPhuCap, int soNgayLamViec) {
        super(maNV, hoTen, luongCoBan);
        this.soGioLamViec = soGioLamViec;
        this.soGioLamViec = soGioLamViec;
        this.tienPhuCap = tienPhuCap;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * soGioLamViec + tienPhuCap;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public double getTienPhuCap() {
        return tienPhuCap;
    }

    public void setTienPhuCap(double tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    @Override
    public String toString() {
        return super.toString() + ", soGioLamViec=" + soGioLamViec + ", tienPhuCap=" + tienPhuCap;
    }
}