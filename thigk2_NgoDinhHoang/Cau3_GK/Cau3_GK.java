package thigk2_NgoDinhHoang.Cau3_GK;
import java.io.*;
import java.util.ArrayList;
public class Cau3_GK {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("fi.txt"));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line)); // doc tung dong va chuyen sang so nguyen roi them vao danh sach
            }
            br.close();
          System.out.println("Danh sách số:");
        for (int x : numbers) {
            System.out.print(x + " ");
        }
    
    
}}} 