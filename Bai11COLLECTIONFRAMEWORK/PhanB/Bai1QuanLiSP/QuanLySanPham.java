package Bai11COLLECTIONFRAMEWORK.PhanB.Bai1QuanLiSP;
import java.util.ArrayList;
import java.util.List;
class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSP() { return maSP; }
    public String getTenSP() { return tenSP; }
    public double getGia() { return gia; }
    public int getSoLuong() { return soLuong; }

    @Override
    public String toString() {
        return String.format("Ma: %-8s |Ten: %-15s | Gia: %-10.2f | SL: %-5d", 
            maSP, tenSP, gia, soLuong);
    }
}
public class QuanLySanPham {
    private List<SanPham> danhSachSP;

    public QuanLySanPham() {
        this.danhSachSP = new ArrayList<>();
    }

    public void themSanPham(SanPham sp) {
        danhSachSP.add(sp);
        System.out.println("Da them san pham: " + sp.getTenSP());
    }

    public boolean xoaSanPhamTheoMa(String ma) {
        for (int i = 0; i < danhSachSP.size(); i++) {
            if (danhSachSP.get(i).getMaSP().equalsIgnoreCase(ma)) {
                danhSachSP.remove(i);
                System.out.println("Da xoa san pham ma: " + ma);
                return true;
            }
        }
        System.out.println("Khong tim thay ma san pham: " + ma);
        return false;
    }
    public List<SanPham> timTheoTenGanDung(String ten) {
        List<SanPham> ketQua = new ArrayList<>();
        for (SanPham sp : danhSachSP) {
            if (sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {
                ketQua.add(sp);
            }
        }
        return ketQua;
    }

    public void sapXepTheoGia(boolean tangDan) {
        int n = danhSachSP.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean dieuKien;
                if (tangDan) {
                    dieuKien = danhSachSP.get(j).getGia() > danhSachSP.get(j + 1).getGia();
                } else {
                    dieuKien = danhSachSP.get(j).getGia() < danhSachSP.get(j + 1).getGia();
                }

                if (dieuKien) {
                    SanPham temp = danhSachSP.get(j);
                    danhSachSP.set(j, danhSachSP.get(j + 1));
                    danhSachSP.set(j + 1, temp); //swap()
                }
            }
        }
    }

    public double tinhTongGiaTriKho() {
        double tong = 0;
        for (SanPham sp : danhSachSP) {
            tong += sp.getGia() * sp.getSoLuong();
        }
        return tong;
    }

    public List<SanPham> lietKeSapHetHang() {
        List<SanPham> hetHang = new ArrayList<>();
        for (SanPham sp : danhSachSP) {
            if (sp.getSoLuong() < 10) {
                hetHang.add(sp);
            }
        }
        return hetHang;
    }

    public void hienThiDanhSach(List<SanPham> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (SanPham sp : list) {
            System.out.println(sp);
        }
    }
}