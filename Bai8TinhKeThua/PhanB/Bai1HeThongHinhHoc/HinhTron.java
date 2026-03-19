package Bai8TinhKeThua.PhanB.Bai1HeThongHinhHoc;

public class HinhTron extends HinhHoc {
    private int r;
    public HinhTron(String ten, String mauSac, int r) {
        super(ten, mauSac);
        this.r = r;
    }
    @Override
    public int tinhDienTich() {
        return (int) (Math.PI * r * r);
    }
    @Override
    public int tinhChuVi() {
        return (int) (2 * Math.PI * r);
    }
}