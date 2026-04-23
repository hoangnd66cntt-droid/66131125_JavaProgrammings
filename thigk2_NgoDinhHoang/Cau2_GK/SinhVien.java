package thigk2_NgoDinhHoang.Cau2_GK;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private int namSinh; // khai bao cac thuoc tinh cua lop SinhVien
    public SinhVien(String maSV, String hoTen, String lop, int namSinh) { // constructor SinhVien
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.namSinh = namSinh;
    }
    public String getMaSV() { // getter va setter cho cac thuoc tinh
        return maSV;
    }
    void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLop() {
        return lop;
    }
    void setLop(String lop) {
        this.lop = lop;
    }
    public int getNamSinh() {
        return namSinh;
    }
    void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
  public void inThongTin() { // phuong thuc in thong tin sinh vien
    System.out.println(maSV + " - " + hoTen + " - " + lop + " - " + namSinh);
}
}
