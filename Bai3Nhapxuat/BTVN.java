package Bai3Nhapxuat;
import java.util.Scanner;
public class BTVN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so kWh dien tieu thu: ");
        double soDien = sc.nextDouble();
        double tongTien = 0;
        if (soDien <= 50) {
            tongTien = soDien*1806;
        } else if (soDien <= 100){
            tongTien = (50 * 1806)+((soDien - 50) * 1866);
        } else if (soDien <=200) {
            tongTien = (50 *1806) + (50* 1866) + ((soDien - 100) * 2167);
        } else {
            tongTien = (50 * 1806) + (50 * 1866) + (100 * 2167) + ((soDien - 200) * 2729);
        }
        System.out.printf("Tong tien dien phai tra: %,.0f VND\n", tongTien);
        sc.close();
    }
}