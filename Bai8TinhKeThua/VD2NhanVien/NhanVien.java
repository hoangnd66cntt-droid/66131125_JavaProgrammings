package Bai8TinhKeThua.VD2NhanVien;
public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;
    
    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    public double tinhLuong() {
        return luongCoBan;
    }
    public String getMaNV() {
        return maNV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + '}';
    }
}