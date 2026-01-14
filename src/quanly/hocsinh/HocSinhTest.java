package quanly.hocsinh;

public class HocSinhTest {
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh();
        HocSinh hocSinh2 = new HocSinh("123", "Gia Kiet","11A");
        HocSinh hocSinh3 = new HocSinh("234","Anh Khoa","12B",10,9,8);

        hocSinh1.setDiemToan(5);
        hocSinh1.setDiemToan(-2);

        hocSinh1.hienThiThongTin();
        hocSinh1.xepLoai();
        hocSinh2.hienThiThongTin();
        hocSinh2.xepLoai();
        hocSinh3.hienThiThongTin();
        hocSinh3.xepLoai();
    }
}
