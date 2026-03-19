package Bai8TinhKeThua.VD2NhanVien;
public class Quanly extends NhanVien {
    private double phuCapChucVu;
    private double heSoKinhNghiem;
    
    public Quanly(String maNV, String hoTen, double luongCoBan,
                 double phuCapChucVu, double heSoKinhNghiem) {
        super(maNV, hoTen, luongCoBan);
        this.phuCapChucVu = phuCapChucVu;
        this.heSoKinhNghiem = heSoKinhNghiem;
    }
    
    @Override
    public double tinhLuong() {
        return (luongCoBan * heSoKinhNghiem) + phuCapChucVu;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", phuCapChucVu=" + phuCapChucVu + ", heSoKinhNghiem=" + heSoKinhNghiem + ", luong=" + tinhLuong() + ", chucVu=Quan Ly";
    }
    public void hopBanGiamDoc() {
        System.out.println(hoTen + " đang họp với ban giám đốc...");
    }
}