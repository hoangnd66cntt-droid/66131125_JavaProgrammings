package Bai10Abstract_Interface.bai1;

class DienThoaiThongMinh extends ThietBiDienTu implements CoTheKetNoiInternet, CoTheCamUng {
    public DienThoaiThongMinh(String ten, double gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }
    void bat() { 
        System.out.println("Dien thoai " + ten + " dang khoi dong"); 
    }
    void tat() {
         System.out.println("Dien thoai " + ten + " dang tat nguon..."); 
        }
    public void ketNoiWifi() {
         System.out.println(ten + " da ket noi Wifi."); 
    }
    public void ngatKetNoi() { 
        System.out.println(ten + " da ngat Wifi."); 
    }
    public void cham() { 
        System.out.println("da cham vao icon ung dung.");
}
    public void vuot() { 
        System.out.println("da vuot man hinh."); 
    }
}
