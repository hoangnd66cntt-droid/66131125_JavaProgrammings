package   Bai5Vonglap;
import java.util.Scanner;
public class kimcuong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        for(int i=1;i<=n/2;i++)
        {
        for(int z=1;z<=(n-m)/2;z++) System.out.print("*");
        for(int j=1;j<=m;j++) System.out.print("X");
        for(int k=1;k<=(n-m)/2;k++) System.out.print("*");
        System.out.println(" ");
        m+=2;
        }
        for(int i=1;i<=n;i++) System.out.print("X");
        System.out.println(" ");
        for(int i=1;i<=n/2;i++)
        {
        for(int z=1;z<=(n-m)/2;z++) System.out.print("*");
        for(int j=1;j<=m;j++) System.out.print("X");
        for(int k=1;k<=(n-m)/2;k++) System.out.print("*");
        System.out.println(" ");
        m-=2;
        }
}
}