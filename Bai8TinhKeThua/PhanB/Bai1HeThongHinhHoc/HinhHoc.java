package Bai8TinhKeThua.PhanB.Bai1HeThongHinhHoc;

public class HinhHoc {
    private String ten;
    private String mauSac;
    public HinhHoc(String ten, String mauSac) {
        this.ten = ten;
        this.mauSac = mauSac;
    }
public int tinhDienTich() {
    return tinhDienTich();
    }
    public int tinhChuVi() {
    return tinhChuVi();
}
public String getTen() {
    return ten;
}
public String getMauSac() {
    return mauSac;
}
public void setTen(String ten) {
    this.ten = ten;
}
public void setMauSac(String mauSac) {
    this.mauSac = mauSac;
}
public String toString() {
    return "HinhHoc:" +"ten=" + ten + ", mauSac='" + mauSac ;
}
}
