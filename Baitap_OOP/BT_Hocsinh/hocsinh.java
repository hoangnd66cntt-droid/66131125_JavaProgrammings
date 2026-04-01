package Baitap_OOP.BT_Hocsinh;

public class hocsinh {
    private String tenHs;
    private short tuoiHs;
    private  String lopHs;
    public hocsinh() {
    
    }
    public hocsinh(String tenHs, short tuoiHs, String lopHs) {
        super();
        this.tenHs = tenHs;
        this.tuoiHs = tuoiHs;
        this.lopHs = lopHs;
    }
  public  short getTuoiHs() {
        return tuoiHs;
    }
    public String getTenHs() {
            return tenHs;
        }
        public String getLopHs() {
            return lopHs;
     }
    public void setTenHs(String tenHs) {
        this.tenHs = tenHs;
    }
    public void setTuoiHs(short tuoiHs) {
        this.tuoiHs = tuoiHs;
    }
    public void setLopHs(String lopHs) {
        this.lopHs = lopHs;
    }
    @Override
    public String toString() {
       return "Tên học sinh: " + tenHs + ", Tuổi: " + tuoiHs + ", Lớp: " + lopHs;
    }
}