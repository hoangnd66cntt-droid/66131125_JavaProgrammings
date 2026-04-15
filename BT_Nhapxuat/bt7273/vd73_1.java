package BT_Nhapxuat.bt7273;
import java.io.*;
public class vd73_1 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Nhap chuoi:");
        System.out.println("Nhap 'stop' ket thuc chuong trinh.");
         do
        {
         str = br.readLine();
    System.out.println(str);
        } while(!str.equals("stop"));
    }
}
