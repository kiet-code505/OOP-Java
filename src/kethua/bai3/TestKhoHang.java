package kethua.bai3;

public class TestKhoHang {
    public static void main(String[] args) {
        SanPham sanpham1 = new SanPham("SP01", "Bút bi", 5000, 100);
        SanPhamDienTu sanpham2 = new SanPhamDienTu("SP02", "Laptop", 20000000, 10);

        System.out.println("Thong tin ban dau");
        sanpham1.hienThiThongTin();
        sanpham2.hienThiThongTin();

        System.out.println("Nhap/Xuat kho");
        sanpham1.nhapKho(50);
        sanpham1.xuatKho(30);
        sanpham2.xuatKho(5);

        System.out.println("Sau khi cap nhap");
        sanpham1.hienThiThongTin();
        sanpham2.hienThiThongTin();
    }
}
