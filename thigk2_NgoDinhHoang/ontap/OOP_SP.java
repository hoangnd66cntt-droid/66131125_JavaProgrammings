package thigk2_NgoDinhHoang.ontap;
public class OOP_SP {
	private String masp, tensp, loaisp;
	private double gia;
	OOP_SP(){}
	OOP_SP(String masp, String tensp, String loaisp, double gia)
	{
		this.masp = masp;
		this.tensp = tensp;
		this.loaisp = loaisp;
		this.gia = gia;
	}
	public String getMasp() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public String getLoaisp() {
		return loaisp;
	}
	public void setLoaisp(String loaisp) {
		this.loaisp = loaisp;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "OOP_SP [masp=" + masp + ", tensp=" + tensp + ", loaisp=" + loaisp + ", gia=" + gia + "]";
	}
	
}
