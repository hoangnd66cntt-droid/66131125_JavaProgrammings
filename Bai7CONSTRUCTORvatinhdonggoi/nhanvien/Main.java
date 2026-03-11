package Bai7CONSTRUCTORvatinhdonggoi.nhanvien;

public class Main {
    public static void main(String[] args) {
        nhanvien nv1 = new nhanvien("NV001", "Nguyễn Văn A", 10000000, 2.5);
        nhanvien nv2 = new nhanvien("NV002", "Trần Thị B", 8000000, 2.0); 
        nhanvien nv3 = new nhanvien("NV003", "Lê Văn C", 5000000, 2.0);
        nhanvien nv4 = new nhanvien("NV004", "Phung Thanh D", 3600000, 2.0);

        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
        nv4.hienThiThongTin();
    }
}