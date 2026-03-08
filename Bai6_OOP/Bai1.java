package Bai6_OOP;

class Sach {
    String tieuDe;
    String tacGia;
    double gia;
    int soTrang;
    public Sach(String tieuDe, String tacGia, double gia, int soTrang) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }
    public void hienThiBThongTin() {
        System.out.println("Tên sách: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá: " + gia + " VNĐ");
        System.out.println("Số trang: " + soTrang);
        System.out.println("---------------------------");
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Sach sach1 = new Sach("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 55000, 150);
        Sach sach2 = new Sach("Lão Hạc", "Nam Cao", 40000, 80);
        Sach sach3 = new Sach("Số Đỏ", "Vũ Trọng Phụng", 65000, 200);
        System.out.println("--- THÔNG TIN CÁC CUỐN SÁCH ---");
        sach1.hienThiBThongTin();
        sach2.hienThiBThongTin();
        sach3.hienThiBThongTin();
    }
}