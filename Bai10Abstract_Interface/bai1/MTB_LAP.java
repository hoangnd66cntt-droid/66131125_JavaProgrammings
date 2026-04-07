package Bai10Abstract_Interface.bai1;

import Bai10Abstract_Interface.bai1.ThietBiDienTu.CoTheCamUng;
import Bai10Abstract_Interface.bai1.ThietBiDienTu.CoTheKetNoiInternet;

class MayTinhBang extends ThietBiDienTu implements CoTheKetNoiInternet, CoTheCamUng {
    public MayTinhBang(String ten, double gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }

    @Override 
    void bat() { 
        System.out.println("Máy tính bảng sáng màn hình..."); 
    }
    @Override void tat() {
         System.out.println("Máy tính bảng đang vào chế độ ngủ..."); 
        }
    
    public void ketNoiWifi() {
         System.out.println("Máy tính bảng đã kết nối Internet."); 
        }
    public void ngatKetNoi() {
         System.out.println("Ngắt Internet máy tính bảng."); 
        }
    public void cham() {
         System.out.println("Chạm vào màn hình lớn."); 
        }
    public void vuot() {
         System.out.println("Vuốt để đọc sách."); 
        }
}

class Laptop extends ThietBiDienTu implements CoTheKetNoiInternet {
    public Laptop(String ten, double gia, String hangSanXuat) {
        super(ten, gia, hangSanXuat);
    }

    @Override 
    void bat() { 
        System.out.println("Laptop đang khởi động Windows/MacOS..."); 
    }
    @Override
    void tat() { 
        System.out.println("Laptop đang Shutdown..."); 
    }

    public void ketNoiWifi() {
         System.out.println("Laptop đã cắm dây mạng hoặc bắt Wifi."); 
        }
    public void ngatKetNoi() {
        System.out.println("Laptop đã ngắt kết nối mạng."); 
    }
}
