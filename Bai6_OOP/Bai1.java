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
        System.out.println("Ten sach: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Gia: " + gia + " VND");
        System.out.println("So trang: " + soTrang);
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Sach sach1 = new Sach("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 55000, 150);
        Sach sach2 = new Sach("Lão Hạc", "Nam Cao", 40000, 80);
        Sach sach3 = new Sach("IT", "Stephen King", 165000, 300);
        sach1.hienThiBThongTin();
        sach2.hienThiBThongTin();
        sach3.hienThiBThongTin();
    }
}