package Bai8TinhKeThua.PhanB.Bai2HeThongPTGiaoThong;
public class PhuongTien {
    protected String hangSanXuat;
    protected int namSanXuat;
    protected double giaBan;

    public PhuongTien(String hang, int nam, double gia) {
        this.hangSanXuat = hang;
        this.namSanXuat = nam;
        this.giaBan = gia;
    }
    public String getHangSanXuat() {
         return hangSanXuat; }
    public int getNamSanXuat() { 
        return namSanXuat; }
    public double getGiaBan() { 
        return giaBan; }
    public int layVanTocToiDa() {
      return 0;
    }
    public int laySoChoNgoi() {
        return 0;
    }
    public String toString() {
        return "PhuongTien{" + "hangSanXuat=" + hangSanXuat + ", namSanXuat=" + namSanXuat + ", giaBan=" + giaBan + '}';
    }
}