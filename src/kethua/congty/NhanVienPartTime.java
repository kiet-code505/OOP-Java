package kethua.congty;

public class NhanVienPartTime extends NhanVien {

    private int soGioLam;
    private final double gioLuong;

    private static int demNVPartTime = 0;

    public static final int SO_GIO_TOI_DA_THANG = 160;
    public static final double GIO_LUONG_TOI_THIEU = 30_000;

    public NhanVienPartTime(String maNV, String hoTen, int tuoi,
                            double gioLuong, int soGioLam) {
        super(maNV, hoTen, tuoi);
        if (gioLuong < GIO_LUONG_TOI_THIEU)
            throw new IllegalArgumentException("Gio luong khong hop le");

        this.gioLuong = gioLuong;
        this.soGioLam = soGioLam;
        demNVPartTime++;
    }

    public static int getDemNVPartTime() {
        return demNVPartTime;
    }

    public static double tinhLuongTheoGio(int soGio, double gioLuong) {
        return soGio * gioLuong;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * gioLuong;
    }

    @Override
    public String getLoaiNhanVien() {
        return "Nhan vien Part-time";
    }

    // ===== Overloading =====
    public void themGioLam(int soGio) {
        if (soGioLam + soGio > SO_GIO_TOI_DA_THANG)
            throw new IllegalArgumentException("Vuot gio toi da");
        soGioLam += soGio;
    }

    public void themGioLam(int soGio, String moTa) {
        themGioLam(soGio);
        System.out.println("Mo ta: " + moTa);
    }

    public double tinhLuongTrungBinhTheoNgay() {
        return tinhLuong() / 30;
    }
}
