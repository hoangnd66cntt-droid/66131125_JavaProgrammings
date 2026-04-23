package thigk2_NgoDinhHoang.Cau2_GK;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSv = new ArrayList<>();
        dsSv.add(new SinhVien("66131121", "Nguyen Van A", "CNTT", 2000)); // hardcode 2 sinh vien vao danh sach
        dsSv.add(new SinhVien("66131122", "Phung Thanh D", "Kinh te", 1985));
        dsSv.add(new SinhVien("66131123", "Hong Tham", "Dien tu", 2001));
        for (SinhVien sv : dsSv) { // duyet qua tung sinh vien trong danh sach va in thong tin
            sv.inThongTin();    
        }
    }
}
