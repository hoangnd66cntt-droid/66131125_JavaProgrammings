package Bai8TinhKeThua.VD2NhanVien;

public class NhanVienKinhDoanh extends NhanVien {
    private double doanhSo;
    private double tyLeHoaHong;
    
    public NhanVienKinhDoanh(String maNV, String hoTen, double luongCoBan,
                            double doanhSo, double tyLeHoaHong) {
        super(maNV, hoTen, luongCoBan);
        this.doanhSo = doanhSo;
        this.tyLeHoaHong = tyLeHoaHong;
    }
    
    @Override
    public double tinhLuong() {
        return luongCoBan + (doanhSo * tyLeHoaHong / 100);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", doanhSo=" + doanhSo +  ", luong=" + tinhLuong() +  ", tyLeHoaHong=" + tyLeHoaHong + ", chucVu=Nhan Vien Kinh Doanh";
    }
    public void chamSocKhachHang() {
        System.out.println(hoTen + " đang chăm sóc khách hàng...");
    }
}