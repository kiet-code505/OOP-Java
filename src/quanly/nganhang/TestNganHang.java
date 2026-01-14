package quanly.nganhang;

public class TestNganHang {
    public static void main(String[] args) {
        NganHang nganHang1 = new NganHang(123,"Kiet",12000);
        NganHang nganHang2 = new NganHang(234,"Khoa",13000);
        NganHang nganHang3 = new NganHang(345,"Anh",14000);

       double napTienTK1 = nganHang1.napTien(20000);
       nganHang1.setSoDu(napTienTK1);

       double rutTienTK2 = nganHang2.rutTien(10000);
       nganHang2.setSoDu(rutTienTK2);

       nganHang1.hienThiThongTin();
       nganHang2.hienThiThongTin();
       nganHang3.hienThiThongTin();
    }
}
