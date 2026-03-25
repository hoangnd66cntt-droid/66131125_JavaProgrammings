package Bai8TinhKeThua.PhanB.Bai2HeThongPTGiaoThong;
public class PhuongTien {
    public String hangSanXuat;
    public int namSanXuat;
    public int giaBan;

    public PhuongTien(String hang, int nam, int gia) {
        this.hangSanXuat = hang;
        this.namSanXuat = nam;
        this.giaBan = gia;
    }
    public String getHangSanXuat() {
         return hangSanXuat; 
        }
    public int getNamSanXuat() { 
        return namSanXuat;
     }
    public int getGiaBan() { 
        return giaBan; 
    }
    public void setHangSanXuat(String hang) { 
        this.hangSanXuat = hang; 
    }
    public void setNamSanXuat(int nam) { 
        this.namSanXuat = nam; 
    }
    public void setGiaBan(int gia) { 
        this.giaBan = gia; 
    }
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