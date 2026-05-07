package thigk2_NgoDinhHoang.Cau2_GK;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSv = new ArrayList<>();
        dsSv.add(new SinhVien("66131121", "Nguyen Van A", "CNTT", 2000)); // hardcode 2 sinh vien vao danh sach
        dsSv.add(new SinhVien("66131122", "Phung Thanh D", "Kinh te", 1985));
        dsSv.add(new SinhVien("66131123", "Hong Tham", "Dien tu", 2009));
        for (SinhVien sv : dsSv) { // duyet qua tung sinh vien trong danh sach va in thong tin
            sv.inThongTin();    
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sinh vien moi:");
        System.out.print("Ma SV: ");
        String maSV = sc.nextLine();
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Lop: ");
        String lop = sc.nextLine();
        System.out.print("Nam sinh: ");
       int namSinh = Integer.parseInt(sc.nextLine());
        dsSv.add(new SinhVien(maSV, hoTen, lop, namSinh)); // them sinh vien moi vao danh sach
        System.out.println("sau khi them sinh vien moi:");
        for (SinhVien sv : dsSv) { // in lai danh sach sau khi them
            sv.inThongTin();
        }
        System.out.println("Sinh vien co tuoi > 20:"); // ds sinh vien co tuoi >20
        for(SinhVien sv: dsSv)
        {
          int tuoi = 2026 - sv.getNamSinh(); // tinh tuoi cua sinh vien
          if(tuoi >20) { // neu tuoi > 20 thi in thong tin sinh vien do
              sv.inThongTin();
        }
        }
          sc.close(); // dong scanner sau khi su dung
    }
  
}
// tao lop SinhVien voi cac thuoc tinh maSV, hoTen, lop, namSinh va phuong thuc inThongTin de in thong tin sinh vien
// trong ham main, tao danh sach sinh vien, them 3 sinh vien vao danh sach, in thong tin tung sinh vien, nhap thong tin 1 sinh vien moi tu nguoi dung va them vao danh sach, in lai danh sach sau khi them, in ra cac sinh vien co tuoi > 20 (nam 2026- namSinh)