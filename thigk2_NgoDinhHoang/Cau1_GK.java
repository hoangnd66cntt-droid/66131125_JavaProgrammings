package thigk2_NgoDinhHoang;
import java.util.Scanner;
public class Cau1_GK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tao scanner de doc du lieu tu nguoi dung
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble(); // nhap can nang
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble(); // nhap chieu cao 
        double bmi = weight / (height * height); // tinh chi so BMI (can nang / (chieu cao * chieu cao))
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
        if (bmi < 18.5) { //chi so bmi < 18.5 ->thieu can, tu 18.5-25 ->binh thuong, tu 25-29.9 -> thua can,>30 -> beo phi
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
        scanner.close(); // dong scanner sau khi su dung
    }
}
