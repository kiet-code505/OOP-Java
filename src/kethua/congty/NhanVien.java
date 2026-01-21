package kethua.congty;

public abstract class NhanVien {
    private final String maNV;
    private String hoTen;
    private int tuoi;
    private double luongCoBan;

    protected static int tongNhanVien = 0;

    public static final double LUONG_CO_BAN_TOI_THIEU = 5_000_000;
    public static final double HE_SO_BAO_HIEM = 0.105;
    public static final int TUOI_TOI_THIEU = 18;

    // ===== Constructor =====
    public NhanVien(String maNV, String hoTen, int tuoi) {
        this(maNV, hoTen, tuoi, LUONG_CO_BAN_TOI_THIEU);
    }

    public NhanVien(String maNV, String hoTen, int tuoi, double luongCoBan) {
        if (tuoi < TUOI_TOI_THIEU)
            throw new IllegalArgumentException("Tuoi phai >= " + TUOI_TOI_THIEU);
        if (luongCoBan < LUONG_CO_BAN_TOI_THIEU)
            throw new IllegalArgumentException("Luong co ban khong hop le");

        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
        tongNhanVien++;
    }

    // ===== Getter / Setter =====
    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuongCoBan(double luongCoBan) {
        if (luongCoBan < LUONG_CO_BAN_TOI_THIEU)
            throw new IllegalArgumentException("Luong < luong toi thieu");
        this.luongCoBan = luongCoBan;
    }

    // ===== Static method =====
    public static int getTongNhanVien() {
        return tongNhanVien;
    }

    public static void hienThiChinhSachCongTy() {
        System.out.println("Luong toi thieu: " + LUONG_CO_BAN_TOI_THIEU);
        System.out.println("Bao hiem: " + (HE_SO_BAO_HIEM * 100) + "%");
        System.out.println("Tuoi toi thieu: " + TUOI_TOI_THIEU);
    }

    // ===== Abstract =====
    public abstract double tinhLuong();
    public abstract String getLoaiNhanVien();

    // ===== Final method =====
    public final double tinhBaoHiem() {
        return luongCoBan * HE_SO_BAO_HIEM;
    }

    // ===== Overloading =====
    public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("Loai: " + getLoaiNhanVien());
    }

    public void hienThiThongTin(boolean chiTiet) {
        hienThiThongTin();
        if (chiTiet) {
            System.out.println("Luong thuc te: " + tinhLuong());
            System.out.println("Bao hiem: " + tinhBaoHiem());
        }
    }
}
