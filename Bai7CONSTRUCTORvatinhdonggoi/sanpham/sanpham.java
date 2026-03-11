package Bai7CONSTRUCTORvatinhdonggoi.sanpham;


public class sanpham {
	private String maSP, tenSP;
	private double gia;
	private int SoLuong;
	public sanpham()
	{
		this.maSP = "1";
		this.tenSP = "banh";
		this.gia = 3000;
		this.SoLuong = 1;
	}
	public sanpham(String maSP, String tenSP, double gia, int SoLuong)
	{
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.SoLuong = SoLuong;
	}
	public String getmaSP() {
		return this.maSP;
	}
	public double getGia() {
		return this.gia;
	}
	public int getSoLuong() {
		return this.SoLuong;
	}
	public void setmaSP(String maSP) {
		if(!maSP.equals("")) this.maSP = maSP;
	}
	public void setGia(double gia) {
		if(gia > 0) this.gia = gia;
	}
	public void setSoLuong(int SoLuong) {
		if(SoLuong >= 0) this.SoLuong = SoLuong; 
	}
	public double tinhthanhtien() {
		return SoLuong * gia;
	}
	public void hienThiThongTin() {
		System.out.println("ban vua mua " + tenSP + " voi so luong la " + SoLuong);
		System.out.println("ban can phai tra :" + tinhthanhtien());
	}
}