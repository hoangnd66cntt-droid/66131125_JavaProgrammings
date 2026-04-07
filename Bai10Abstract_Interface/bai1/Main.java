package Bai10Abstract_Interface.bai1;

public class Main {
   public static void main(String[] args) {
        DienThoaiThongMinh iphone = new DienThoaiThongMinh("iPhone 15", 25000000, "Apple");
        Laptop dell = new Laptop("Dell XPS", 35000000, "Dell");
        MayTinhBang ipad = new MayTinhBang("iPad Pro", 20000000, "Apple");
        System.out.println("--- Kiểm tra Điện thoại ---");
        iphone.hienThiThongTin();
        iphone.bat();
        iphone.ketNoiWifi();
        iphone.cham();
        System.out.println("\n--- Kiểm tra Laptop ---");
        dell.hienThiThongTin();
        dell.bat();
        dell.ketNoiWifi();
        System.out.println("\n--- Kiểm tra Máy tính bảng ---");
        ipad.hienThiThongTin();
        ipad.vuot();
    }
}
