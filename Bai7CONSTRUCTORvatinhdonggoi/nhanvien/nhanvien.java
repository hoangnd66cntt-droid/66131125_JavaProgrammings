package Bai7CONSTRUCTORvatinhdonggoi;

public class nhanvien {
    // Thuộc tính private để đảm bảo tính đóng gói (Encapsulation)
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;

    // Constructor nhận đầy đủ thông tin
    public nhanvien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Getter và Setter cho các thuộc tính
    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public double getLuongCoBan() { return luongCoBan; }
    public void setLuongCoBan(double luongCoBan) { this.luongCoBan = luongCoBan; }

    public double getHeSoLuong() { return heSoLuong; }
    public void setHeSoLuong(double heSoLuong) { this.heSoLuong = heSoLuong; }

    // Phương thức tính lương
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // Phương thức xếp loại dựa trên tổng lương
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

    // Phương thức hiển thị (tùy chọn để kiểm tra)
    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tổng lương: " + String.format("%,.0f", tinhLuong()) + " VNĐ");
        System.out.println("Xếp loại: " + xepLoai());
        System.out.println("---------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng nhân viên
        nhanvien nv1 = new nhanvien("NV001", "Nguyễn Văn A", 10000000, 2.5); // 25tr -> Xuất sắc
        nhanvien nv2 = new nhanvien("NV002", "Trần Thị B", 8000000, 2.0);    // 16tr -> Tốt
        nhanvien nv3 = new nhanvien("NV003", "Lê Văn C", 5000000, 2.0);      // 10tr -> Khá

        // Hiển thị kết quả
        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}