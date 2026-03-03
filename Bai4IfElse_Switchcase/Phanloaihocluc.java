package Bai4IfElse_Switchcase;
import java.util.Scanner;
public class Phanloaihocluc {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem trung binh: ");
        double diem = sc.nextDouble();
        if (diem >= 8.0) {
            System.out.println("Xep loai: GIOI");
        } else if (diem >= 6.5) {
            System.out.println("Xep loai: KHA");
        } else if (diem >= 5.0) {
            System.out.println("Xep loai: TRUNG BINH");
        } else {
            System.out.println("Xep loai: YEU");
        }
        sc.close();
    }
}