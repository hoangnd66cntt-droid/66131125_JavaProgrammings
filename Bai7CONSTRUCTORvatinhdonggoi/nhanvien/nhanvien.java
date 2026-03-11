package Bai7CONSTRUCTORvatinhdonggoi.nhanvien;

public class nhanvien {

    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    public nhanvien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public double getLuongCoBan() { return luongCoBan; }
    public void setLuongCoBan(double luongCoBan) { this.luongCoBan = luongCoBan; }

    public double getHeSoLuong() { return heSoLuong; }
    public void setHeSoLuong(double heSoLuong) { this.heSoLuong = heSoLuong; }
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    public String xepLoai() {
        double tongLuong = tinhLuong();
        if (tongLuong >= 20000000) {
            return "Xuất sắc";
        } else if (tongLuong >= 15000000) {
            return "Tốt";
        } else {
            return "Khá";
        }
    }
    public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tong luong: " + String.format("%,.0f", tinhLuong()) + " VNĐ");
        System.out.println("XXep loai: " + xepLoai());
        System.out.println("---------------------------");
    }
}

