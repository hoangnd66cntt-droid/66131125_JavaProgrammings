package Bai8TinhKeThua.PhanB.Bai1HeThongHinhHoc;

public class HinhTamGiac extends HinhHoc {
    private int canhA;
    private int canhB;
    private int canhC;
    public HinhTamGiac(String ten, String mauSac, int canhA, int canhB, int canhC) {
        super(ten, mauSac);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
    @Override
    public int tinhDienTich() {
        double p = (canhA + canhB + canhC) / 2.0;
        return (int) Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }
    @Override
    public int tinhChuVi() {
        return canhA + canhB + canhC;
    }
    
}
