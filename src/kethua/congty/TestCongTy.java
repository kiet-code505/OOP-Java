package kethua.congty;

public class TestCongTy {
    public static void main(String[] args) {
        // 1. Chính sách công ty
        NhanVien.hienThiChinhSachCongTy();

        // 2. Full-time
        NhanVienFullTime nv1 = new NhanVienFullTime(
                "NV001", "Nguyen Van A", 28,
                8_000_000, "IT", 22, 2_000_000);

        NhanVienFullTime nv2 = new NhanVienFullTime(
                "NV002", "Tran Thi B", 25,
                7_000_000, "Marketing", 20, 1_500_000);

        // 3. Part-time
        NhanVienPartTime nv3 = new NhanVienPartTime(
                "NV003", "Le Van C", 22, 50_000, 120);

        NhanVienPartTime nv4 = new NhanVienPartTime(
                "NV004", "Pham Thi D", 20, 45_000, 80);

        // 4. Static counter
        System.out.println("Tong NV: " + NhanVien.getTongNhanVien());
        System.out.println("Full-time: " + NhanVienFullTime.getDemNVFullTime());
        System.out.println("Part-time: " + NhanVienPartTime.getDemNVPartTime());

        // 5. Lương & bảo hiểm
        nv1.hienThiThongTin(true);
        nv2.hienThiThongTin(true);

        // 6. Kiểm tra ngày làm
        System.out.println("NV1 du ngay lam: " + nv1.isDuNgayLam());
        System.out.println("NV2 du ngay lam: " + nv2.isDuNgayLam());

        // 7. Thưởng
        nv1.tangThuong(1_000_000);
        nv2.tangThuong();

        // 8. Thêm giờ
        nv3.themGioLam(30, "Lam du an X");
        nv4.themGioLam(50);

        // 9. Lương TB/ngày
        System.out.println("Luong TB NV3: " + nv3.tinhLuongTrungBinhTheoNgay());
        System.out.println("Luong TB NV4: " + nv4.tinhLuongTrungBinhTheoNgay());

        // 10. Static method
        System.out.println("Luong 100 gio (40k): " + NhanVienPartTime.tinhLuongTheoGio(100, 40_000));

        System.out.println("Hien thi thong tin chi tiet");

        nv1.hienThiThongTin();

        nv1.hienThiThongTin(true);

        System.out.println(" Test validation gia ban");

        try {
            NhanVienFullTime nvSaiTuoi = new NhanVienFullTime(
                    "NV999", "Test Tuoi", 16,
                    8_000_000, "IT", 22, 0);
        } catch (Exception e) {
            System.out.println("Loi tuoi: " + e.getMessage());
        }

        try {
            nv2.setLuongCoBan(3_000_000);
        } catch (Exception e) {
            System.out.println("Loi luong: " + e.getMessage());
        }

        try {
            nv3.themGioLam(100);
        } catch (Exception e) {
            System.out.println("Loi gio lam: " + e.getMessage());
        }
    }
}
