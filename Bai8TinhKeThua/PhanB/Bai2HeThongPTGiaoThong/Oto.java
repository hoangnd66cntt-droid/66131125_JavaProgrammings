package Bai8TinhKeThua.PhanB.Bai2HeThongPTGiaoThong;

public class Oto extends PhuongTien {
    private int soCho;
    private String kieuDongCo;

    public Oto(String hang, int nam, double gia, int soCho, String kieuDongCo) {
        super(hang, nam, gia);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }
    @Override
    public int layVanTocToiDa() {
        return 200;
    }

    @Override
    public int laySoChoNgoi() {
        return this.soCho;
    }
    public double tinhThueTruocBa() {
        return giaBan * 0.1; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Oto{soCho=" + soCho + ", kieuDongCo=" + kieuDongCo + "}";
    }
}