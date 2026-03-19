package Bai8TinhKeThua.PhanB.Bai1HeThongHinhHoc;

public class Main {
    public static void main(String[] args) {
        HinhHoc hcn = new HinhChuNhat("Hinh chu nhat 1", "Do", 5, 3);
        System.out.println(hcn);
        HinhHoc htg = new HinhTamGiac("Hinh tam giac 1", "Xanh", 3, 4, 5);
        System.out.println(htg);
        HinhHoc ht = new HinhTron("Hinh tron 1", "Vang", 4);
        System.out.println(ht);
}
}