package Bai11COLLECTIONFRAMEWORK.vd1;   
import java.util.ArrayList;
import java.util.List;
public class VD1BAI11 {
    public static void main(String[] args) {
        System.out.println("=== ARRAYLIST CO BAN - MINH HOA CAC PHUONG THUC ===\n");
        List<String> danhSachTen = new ArrayList<>();
        System.out.println("--- THEM PHAN TU ---");
        danhSachTen.add("Nguyen Van A");
        danhSachTen.add("Tran Thi B");
        danhSachTen.add("Le Van C");
        
        danhSachTen.add(1, "Pham Thi D"); 
        
        System.out.println("Danh sach sau khi them: " + danhSachTen);
        
        System.out.println("\n--- KICH THUOC ---");
        System.out.println("So phan tu: " + danhSachTen.size());
        
        System.out.println("\n--- TRUY CAP PHAN TU ---");
        System.out.println("Phan tu thu 0: " + danhSachTen.get(0));
        System.out.println("Phan tu thu 2: " + danhSachTen.get(2));
        
        System.out.println("\n--- CAP NHAT PHAN TU ---");
        System.out.println("Truoc khi cap nhat: " + danhSachTen.get(1));
        danhSachTen.set(1, "Tran Thi B (Da doi ten)");
        System.out.println("Sau khi cap nhat: " + danhSachTen.get(1));
        
        System.out.println("\n--- TIM KIEM ---");
        System.out.println("Co 'Le Van C' khong? " + danhSachTen.contains("Le Van C"));
        System.out.println("Vi tri cua 'Le Van C': " + danhSachTen.indexOf("Le Van C"));
        System.out.println("Vi tri cua 'Khong ton tai': " + danhSachTen.indexOf("Khong ton tai"));
        
        System.out.println("\n--- XOA PHAN TU ---");
        System.out.println("Truoc khi xoa: " + danhSachTen);
        
        String removedByIndex = danhSachTen.remove(0);
        System.out.println("Da xoa (theo index 0): " + removedByIndex);
        
        boolean removedByObject = danhSachTen.remove("Le Van C");
        System.out.println("Xoa 'Le Van C' thanh cong? " + removedByObject);
        
        System.out.println("Sau khi xoa: " + danhSachTen);
        
        System.out.println("\n--- KIEM TRA RONG ---");
        System.out.println("Danh sach co rong khong? " + danhSachTen.isEmpty());
        
        System.out.println("\n--- DUYET DANH SACH ---");
        System.out.println("Cach 1: For thong thuong");
        for (int i = 0; i < danhSachTen.size(); i++) {
            System.out.println("Vi tri " + i + ": " + danhSachTen.get(i));
        }
        
        System.out.println("\nCach 2: For-each");
        for (String ten : danhSachTen) {
            System.out.println("Ten: " + ten);
        }
        
        System.out.println("\nCach 3: ForEach voi Lambda (Java 8+)");
        danhSachTen.forEach(ten -> System.out.println("Ten: " + ten));
        
        System.out.println("\n--- CHUYEN DOI SANG MANG ---");
        String[] mangTen = danhSachTen.toArray(new String[0]);
        System.out.println("Mang chuyen doi:");
        for (String ten : mangTen) {
            System.out.println(ten);
        }
        
        System.out.println("\n--- XOA TOAN BO ---");
        danhSachTen.clear();
        System.out.println("Sau khi clear, kich thuoc: " + danhSachTen.size());
        System.out.println("Danh sach co rong khong? " + danhSachTen.isEmpty());
    }
}