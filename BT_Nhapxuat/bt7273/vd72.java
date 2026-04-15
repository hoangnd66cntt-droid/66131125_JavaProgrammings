package BT_Nhapxuat.bt7273;
import java.io.*;

class vd72
{
public static void main(String args[]) throws IOException
{
char c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
do
{
c = (char) br.read();
System.out.println(c);
} while(c != '.');
}
} 