package Baitap_OOP.BT_Hocsinh;

public class hocsinh {
    private String tenHs;
    private int tuoiHs;
    private  String lopHs;
    public hocsinh(String tenHs, int tuoiHs, String lopHs) {
        this.tenHs = tenHs;
        this.tuoiHs = tuoiHs;
        this.lopHs = lopHs;
    }
    int getTuoiHs() {
        return tuoiHs;
    }
    String getTenHs() {
            return tenHs;
        }
        String getLopHs() {
            return lopHs;
     }
    void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }
    void setTuoiHs(int tuoiHs) {
        this.tuoiHs = tuoiHs;
    }
    void setLopHs(String lopHs) {
        this.lopHs = lopHs;
    }
    public String toString() {
       return "Tên học sinh: " + tenHs + ", Tuổi: " + tuoiHs + ", Lớp: " + lopHs;
    }
}