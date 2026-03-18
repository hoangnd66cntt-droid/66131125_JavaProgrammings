package Bai11COLLECTIONFRAMEWORK.PhanB.Bai1QuanLiSP;
class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSP() { return maSP; }
    public String getTenSP() { return tenSP; }
    public double getGia() { return gia; }
    public int getSoLuong() { return soLuong; }

    @Override
    public String toString() {
        return String.format("Ma: %-8s | Ten: %-15s | Gia: %-10.2f | SL: %-5d", 
            maSP, tenSP, gia, soLuong);
    }
}