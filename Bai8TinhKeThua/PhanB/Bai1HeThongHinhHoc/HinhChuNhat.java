package Bai8TinhKeThua.PhanB.Bai1HeThongHinhHoc;

public class HinhChuNhat extends HinhHoc {
    private int chieuDai;
    private int chieuRong;
    public HinhChuNhat(String ten, String mauSac, int chieuDai, int chieuRong) {
        super(ten, mauSac);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    @Override
    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }
    @Override
    public int tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}
