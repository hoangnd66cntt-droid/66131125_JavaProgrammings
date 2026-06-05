package thigk2_NgoDinhHoang.ontap;
import java.util.ArrayList;
import java.util.Scanner;
/*
     * Ý tưởng:
     * 0. Tạo class OOP_QLSP với các phương thức và thuộc tính như đề, thêm 1 tt giá
     * 1. Tạo danh sách sản phẩm (ArrayList)
     * 2. Hard code 3 sản phẩm và thêm vào danh sách
     * 3. In danh sách sản phẩm
     * 4. Nhập thêm 1 sản phẩm từ bàn phím và thêm vào danh sách
     * 5. Lọc và in ra các sản phẩm có loại "thực phẩm chức năng"
*/
public class main {
    public static void main(String[] args) {
    	//b1
    	ArrayList<OOP_SP> ds = new ArrayList<>();
    	OOP_SP sp1 = new OOP_SP("SP001", "Quả Lọ", "thực phẩm chức năng", 36000);
    	ds.add(sp1);
    	OOP_SP sp2 = new OOP_SP("SP001", "Quả Lọ 36", "thực phẩm chức năng x", 37000);
    	ds.add(sp2);
    	OOP_SP sp3 = new OOP_SP("SP001", "Quả Lọ 67", "thực phẩm chức năng y", 38000);	
    	ds.add(sp3);
    	for(OOP_SP s: ds)
    	{
    		System.out.println(s.toString());
    	}
    	Scanner sc = new Scanner(System.in);
    	String ma, ten, loai;
    	double gia;
    	System.out.println("ma");
    	ma = sc.nextLine();
    	ten = sc.nextLine();
    	loai = sc.nextLine();
    	gia = sc.nextDouble();
    	OOP_SP sp = new OOP_SP(ma, ten, loai, gia);
    	ds.add(sp);
    	for(OOP_SP x: ds)
    	{
    		if(x.getLoaisp().equals("thực phẩm chức năng")) {System.out.println(x);}
    	}
    }
}
