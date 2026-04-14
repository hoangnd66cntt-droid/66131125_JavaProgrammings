package   Bai10Abstract_Interface.bai1;
abstract class ThietBiDienTu {
    String ten;
    double gia;
    String hangSanXuat;
    public ThietBiDienTu(String ten, double gia, String hangSanXuat) {
        this.ten = ten;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }
    abstract void bat();
    abstract void tat();
    void hienThiThongTin() {
        System.out.println("Thiết bị: " + ten + " | Hãng: " + hangSanXuat + " | Giá: " + gia + " VNĐ");
    }
    interface CoTheKetNoiInternet {
    void ketNoiWifi();
    void ngatKetNoi();
}
    interface CoTheCamUng {
    void cham();
    void vuot();
}
}
