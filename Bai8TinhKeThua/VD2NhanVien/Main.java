package Bai8TinhKeThua.VD2NhanVien;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("NV001", "Nguyen Van A", 5000);
        System.out.println(nv1);
        Quanly ql1 = new Quanly("QL001", "Tran Van C", 6000, 2000, 1.5);
        System.out.println(ql1);
        NhanVienKinhDoanh nvkd1 = new NhanVienKinhDoanh("NVKD001", "Le Thi B", 4000, 100000, 5);
        System.out.println(nvkd1);
        ql1.hopBanGiamDoc();
        nvkd1.chamSocKhachHang();

    }
}
