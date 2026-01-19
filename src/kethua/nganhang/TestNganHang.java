package kethua.nganhang;

public class TestNganHang {
    public static void main(String[] args) {
        TaiKhoanTietKiem tk1 = new TaiKhoanTietKiem("001", "A", 50000,"01/01/2021", 12, 6.5, "01/01/2021");
        TaiKhoanThanhToan tk2 = new TaiKhoanThanhToan("002", "B", 20000, "15/03/2024", "ATM", 10000);
        tk1.hienThiThongTin();
        tk2.hienThiThongTin();

        System.out.println("Lai TK001: " + tk1.tinhLai());
        System.out.println("Lai 6 thang TK001: " + tk1.tinhLai(6));

        tk2.napTien(5000);
        tk2.rutTien(8000);
        tk2.chuyenKhoan("TK001", 2000, "Tra tien thue nha");

        System.out.println("So du cuoi TK001: " + tk1.getSoDu());
        System.out.println("So du cuoi TK002: " + tk2.getSoDu());
    }
}
