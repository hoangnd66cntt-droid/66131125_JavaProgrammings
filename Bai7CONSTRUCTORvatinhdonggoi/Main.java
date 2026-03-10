package Bai7CONSTRUCTORvatinhdonggoi;

public class Main {
    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien("NV001", "Nguyễn Văn A", 10000000, 2.5);
        Nhanvien nv2 = new Nhanvien("NV002", "Trần Thị B", 8000000, 2.0); 
        Nhanvien nv3 = new Nhanvien("NV003", "Lê Văn C", 5000000, 2.0);
        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }