package Baitap_OOP.BT_Hocsinh;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        //bai2a
        hocsinh hs1 = new hocsinh("Nguyen Van A", (short) 15, "10A1");
        hocsinh hs2 = new hocsinh("Phung Thanh D", (short) 36, "120yenlang");
        System.out.println(hs1.toString());
        System.out.println(hs2.toString());
        Scanner sc = new Scanner(System.in);
/* 
     //bai2b
   
         hocsinh hs3=  new hocsinh();
        System.out.print("Nhapten hoc sinh: ");
        String tenHs3 = sc.nextLine();
       // hs.setTenHs(tenHs3);
        System.out.print("Nhaptuoi hoc sinh: ");
        short tuoiHs3 = sc.nextShort();
       // hs3.setTuoiHs((short) sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap lop hoc sinh: ");
         String lopHs3 = sc.nextLine();
       // hs3.setLopHs(sc.nextLine());
        System.out.println(hs3));
        hs3.setTenHs(tenHs3);
        hs3.setTuoiHs(tuoiHs3);
        hs3.setLopHs(lopHs3);
*/
    //cau3a
    System.out.print("Nhap so luong hoc sinh: ");
    int n=sc.nextInt();
    ArrayList<hocsinh> dsHs = new ArrayList<hocsinh>();
    hocsinh hs = new hocsinh();
    String tenHs;
    short tuoiHs;
    String lopHs;
    for(int i=0;i<n;i++){
        System.out.print("Nhap ten hoc sinh: ");
        tenHs = sc.nextLine();
        System.out.print("Nhap tuoi hoc sinh: ");
        tuoiHs = sc.nextShort();
         sc.nextLine();
        System.out.print("Nhap lop hoc sinh: ");
        lopHs = sc.nextLine();
        hs.setTenHs(tenHs);
        hs.setTuoiHs(tuoiHs);
        hs.setLopHs(lopHs);
        dsHs.add(hs);
    }
    //cau3b
    for(hocsinh a: dsHs){
        System.out.println(a.toString());
    }
    //cau4a
    tenHs = sc.nextLine();
    tuoiHs = sc.nextShort();
    sc.nextLine();
    lopHs = sc.nextLine();
    hs.setTenHs(tenHs);
    hs.setTuoiHs(tuoiHs);
    hs.setLopHs(lopHs);
    dsHs.add(hs);
    //cau4b
    for(hocsinh a: dsHs){
        System.out.println(a.toString());
    }
    //cau5a
    for(int i=0;i<=n;i++){
    hocsinh hstim = dsHs.get(i);
    if(hstim.getTenHs()=="D"){
        dsHs.remove(hstim);
        break;
    }
    //cau5b
    for(hocsinh a: dsHs){
        System.out.println(a.toString());
    }   
}
 }
}