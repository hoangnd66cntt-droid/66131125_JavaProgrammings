package Bai8TinhKeThua.PhanB.Bai2HeThongPTGiaoThong;

public class XeMay extends PhuongTien {
    private int dungTichXiLanh;
    private String loaiXe;

    public XeMay(String hang, int nam, double gia, int dungTich, String loai) {
        super(hang, nam, gia);
        this.dungTichXiLanh = dungTich;
        this.loaiXe = loai;
    }
    @Override
    public int layVanTocToiDa() {
        return 150;
    }

    @Override
    public int laySoChoNgoi() {
        return 2; 
    }
    @Override
    public String toString() {
        return super.toString() + ", XeMay{dungTich=" + dungTichXiLanh + ", loai=" + loaiXe + "}";
    }
}