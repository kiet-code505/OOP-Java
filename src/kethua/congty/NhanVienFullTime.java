package kethua.congty;

public class NhanVienFullTime extends NhanVien {

    private int soNgayLam;
    private double thuong;
    private final String phongBan;

    private static int demNVFullTime = 0;

    public static final int SO_NGAY_LAM_CHUAN = 22;
    public static final double HE_SO_LUONG_FULLTIME = 1.5;

    public NhanVienFullTime(String maNV, String hoTen, int tuoi,
                            double luongCoBan, String phongBan,
                            int soNgayLam, double thuong) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
        this.thuong = thuong;
        demNVFullTime++;
    }

    public static int getDemNVFullTime() {
        return demNVFullTime;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() * HE_SO_LUONG_FULLTIME
                * soNgayLam / SO_NGAY_LAM_CHUAN + thuong;
    }

    @Override
    public String getLoaiNhanVien() {
        return "Nhan vien Full-time";
    }

    // ===== Overloading =====
    public void tangThuong(double soTien) {
        thuong += soTien;
    }

    public void tangThuong() {
        thuong += getLuongCoBan() * 0.1;
    }

    public boolean isDuNgayLam() {
        return soNgayLam >= SO_NGAY_LAM_CHUAN;
    }
}
