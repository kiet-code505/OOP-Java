package kethua.bai3;

public class TestTaiKhoan {
    public static void main(String[] args) {
        TaiKhoan taikhoan1 = new TaiKhoanThuong("Kiệt", 10000);
        TaiKhoan taikhoan2 = new TaiKhoanVIP("Anh", 50000);

        System.out.println("Tai khoan thuong");
        taikhoan1.hienThiThongTin();
        taikhoan1.rutTien(1000);

        System.out.println("Tai khoan VIP");
        taikhoan2.hienThiThongTin();
        taikhoan2.rutTien(5000);
    }
}
