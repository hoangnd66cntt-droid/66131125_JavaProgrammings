package Bai7CONSTRUCTORvatinhdonggoi.sanpham;


public class Main {
	public static void main(String[] args) {
		sanpham sp = new sanpham("SP01", "Laptop", 150000, 2);
        sanpham spx = new sanpham("SP02", "Laptop2", 1250000, 2);
		sp.setSoLuong(7);
        sp.hienThiThongTin();
        spx.hienThiThongTin();
	}

}