package Bai8TinhKeThua.VD2NhanVien;

public class NhanVienVanPhong extends NhanVien {
    private int soGioLamViec;
    private double luongThemMoiGio;

    public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, int soGioLamViec, double luongThemMoiGio, int soNgayLamViec) {
        super(maNV, hoTen, luongCoBan);
        this.soGioLamViec = soGioLamViec;
        this.soGioLamViec = soGioLamViec;
        this.luongThemMoiGio = luongThemMoiGio;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * soGioLamViec + luongThemMoiGio * soGioLamViec;
    }
    @Override
    public String toString() {
        return super.toString() + ", soGioLamViec=" + soGioLamViec + ", luongCoBan=" + luongCoBan + ", luong=" + tinhLuong() + '}';
    }
}