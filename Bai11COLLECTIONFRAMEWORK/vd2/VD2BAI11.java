package Bai11COLLECTIONFRAMEWORK.vd2;
import java.util.ArrayList;
import java.util.List;
class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private String lop;
    public SinhVien(String maSV, String hoTen, double diemTB, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;

    }
    
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }
    public String getLop() { return lop; }
    
    @Override
    public String toString() {
        return String.format("Ma: %s, Ho ten: %s, Lop: %s, Diem TB: %.2f", 
            maSV, hoTen, lop, diemTB);
    }
public class VD2BAI11 {
    private List<SinhVien> danhSachSV;
    
    public VD2BAI11() {
        danhSachSV = new ArrayList<>();
    }
    
    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
        System.out.println("Da them: " + sv.getHoTen());
    }
    
    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }
    
    public SinhVien timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) {
            return null;
        }
        
        SinhVien svCaoNhat = danhSachSV.get(0);
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
                svCaoNhat = sv;
            }
        }
        return svCaoNhat;
    }
    
    public double tinhDiemTrungBinhLop() {
        if (danhSachSV.isEmpty()) {
            return 0;
        }
        
        double tong = 0;
        for (SinhVien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }
        return tong / danhSachSV.size();
    }
    
    public List<SinhVien> locSinhVienTheoDiem(double diemToiThieu) {
        List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() >= diemToiThieu) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }
    
    public void sapXepTheoDiem() {
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                    SinhVien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }
    
    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }
        
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        System.out.println(String.format("%-5s %-10s %-20s %-10s", "STT", "Ma SV", "Ho ten", "Diem TB"));
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < danhSachSV.size(); i++) {
            SinhVien sv = danhSachSV.get(i);
            System.out.println(String.format("%-5d %-10s %-20s %-10.2f", 
                i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB()));
        }
    }
    
    public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(maSV)) {
                SinhVien svBiXoa = danhSachSV.remove(i);
                System.out.println("Da xoa: " + svBiXoa.getHoTen());
                return true;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma: " + maSV);
        return false;
    }
    
    public void hienThiHaiSinhVienDauTien() {
        if (danhSachSV.size() >= 2) {
            List<SinhVien> subList = danhSachSV.subList(0, 2);
            System.out.println("\nHai sinh vien dau tien:");
            subList.forEach(System.out::println);
        }
    }}}
