package thigk2_NgoDinhHoang.Cau2_GK;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private int namSinh;
    public SinhVien(String maSV, String hoTen, String lop, int namSinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.namSinh = namSinh;
    }
    public String getMaSV() {
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
}
