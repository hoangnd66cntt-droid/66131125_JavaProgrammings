package Bai6_OOP;

public class Main {
    public static void main(String[] args) {
        concho concho1 = new concho();
        concho concho2 = new concho();
        concho1.nhapthongtin("Nuocmam", 2);
        concho2.nhapthongtin("xidau", 3);
        concho1.sua();
        concho2.sua();
        conmeo conmeo1 = new conmeo();
        conmeo conmeo2 = new conmeo();
        conmeo1.nhapthongtin("Miu", 1);
        conmeo2.nhapthongtin("Miu2", 2);
        conmeo1.meomeo();
        conmeo2.meomeo();  
    }
}
