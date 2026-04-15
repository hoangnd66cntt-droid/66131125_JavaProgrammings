package BT_Nhapxuat.bt7273;
import java.io.*;
public class vdprintwriter {
    public static void main(String args[])
    {
    PrintWriter pw = new PrintWriter(System.out, true);
    int l = 101;
    double r = 123.456;
    double m = (l+r)/2;
    pw.println("Using a PrintWriter.");
    pw.println(l);
    pw.println(r);
    pw.println(m);
}
}