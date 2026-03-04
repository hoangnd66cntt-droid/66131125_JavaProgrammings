package Bai6_OOP;
public class concho {
    public String name;
    public int mau;
    public int tuoi;
    public void nhapthongtin(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }
    public void sua(){
        System.out.println("Concho "+tuoi+"tuoi"+ name + " dang sua...");
    }
}