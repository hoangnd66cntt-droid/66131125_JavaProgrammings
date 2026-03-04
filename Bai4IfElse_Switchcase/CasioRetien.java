package Bai4IfElse_Switchcase;
import java.util.Scanner;
public class CasioRetien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a= ");
        double a=sc.nextDouble();
        System.out.print("Nhap phep tinh (+,-,*,/): ");
        char phepTinh=sc.next().charAt(0);
        System.out.print("b= ");
        double b=sc.nextDouble();
        switch (phepTinh){
            case '+': 
            System.out.println("Ket qua: " + (a + b)); break;
            case '-': 
            System.out.println("Ket qua: " + (a - b)); break;
            case '*': 
            System.out.println("Ket qua: " + (a * b)); break;
            case '/': 
                if (b != 0) 
                    System.out.println("Ket qua: " + (a / b));
                else
                     System.out.println("Loi: Khong the chia cho 0");
                break;
            default: 
            System.out.println("Phep tinh khong hop le!");
        }
        sc.close(); 
    }
}
