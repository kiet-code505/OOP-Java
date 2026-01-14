package quanly.sanpham;

public class TestSanPham {
    public static void main(String[] args) {
        SanPham sanpham1 = new SanPham(12,"Sua", 10000,3);
        SanPham sanpham2 = new SanPham(15,"Banh", 8000,5);
        SanPham sanpham3 = new SanPham(17,"Keo", 9000,10);

        System.out.println("Hien thi thong tin");
        sanpham1.hienThiThongTin();
        sanpham2.hienThiThongTin();
        sanpham3.hienThiThongTin();

        System.out.println("Tinh thanh tien");
        double tinhThanhTienSp1 = sanpham1.tinhThanhTien();
        System.out.println(tinhThanhTienSp1);
        double tinhThanhTienSp2 = sanpham2.tinhThanhTien();
        System.out.println(tinhThanhTienSp2);
        double tinhThanhTienSp3 = sanpham3.tinhThanhTien();
        System.out.println(tinhThanhTienSp3);
    }
}
