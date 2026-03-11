package Bai7CONSTRUCTORvatinhdonggoi.diemoxy;

public class Main {
    public static void main(String[] args) {
        Diem A = new Diem(3, 4);
        Diem B = new Diem(1, 2);
        System.out.println("Khoang cach: " + A.tinhKhoangCach(B));
        if (A.kiemTraTrungNhau(B)) {
            System.out.println("Hai diem trung nhau");
        } else {
            System.out.println("Hai diem khong trung nhau");
        }
        Diem C = A.doiXungQuaGoc();
        System.out.print("Diem doi xung cua A: ");
        C.tostring();
    }
}