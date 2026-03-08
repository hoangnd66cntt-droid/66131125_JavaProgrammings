package   Bai6_OOP;
public class conmeo {
    public String name;
    public int mau;
    public int tuoi;
    public void nhapthongtin(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }
    public void meomeo(){
        System.out.println("Conmeo "+tuoi+"tuoi"+"ten: "+ name + " dang meo meo...");
    }
}