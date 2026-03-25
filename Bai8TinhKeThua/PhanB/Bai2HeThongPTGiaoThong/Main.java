package Bai8TinhKeThua.PhanB.Bai2HeThongPTGiaoThong;

public class Main {
    public static void main(String[] args) {
        XeMay xm = new XeMay("Honda", 2023, 40000000, 125, "Tay ga");
        Oto oto = new Oto("VinFast", 2024, 850000000, 5, "Dien");
        System.out.println(xm.toString());
        System.out.println("Van toc toi da xe may: " + xm.layVanTocToiDa() + " km/h");
        System.out.println(oto.toString());
        System.out.println("Thue truoc ba oto: " + String.format("%,.0f", oto.tinhThueTruocBa()) + " VNĐ");
    }
}