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
        
    }
}
