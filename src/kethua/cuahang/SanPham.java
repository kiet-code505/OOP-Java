package kethua.cuahang;

public abstract class SanPham {
    private final String maSP;
    private String tenSP;
    private double giaNhap;
    private double giaBan;

    private static int demSanPham = 0;

    public static final double VAT = 0.1;
    public static final double TY_LE_LOI_NHUAN_TOI_THIEU = 0.15;

    // Constructor 2 tham số
    public SanPham(String maSP, String tenSP) {
        this(maSP, tenSP, 0, 0);
    }

    // Constructor đầy đủ
    public SanPham(String maSP, String tenSP, double giaNhap, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaNhap = giaNhap;
        setGiaBan(giaBan);
        demSanPham++;
    }

    // Getter
    public String getMaSP() { return maSP; }
    public String getTenSP() { return tenSP; }
    public double getGiaNhap() { return giaNhap; }
    public double getGiaBan() { return giaBan; }

    // Setter
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan >= giaNhap * (1 + TY_LE_LOI_NHUAN_TOI_THIEU))
            this.giaBan = giaBan;
        else
            System.out.println("❌ Giá bán không đạt lợi nhuận tối thiểu");
    }

    // Static methods
    public static int getDemSanPham() {
        return demSanPham;
    }

    public static void hienThiThongTinHeThong() {
        System.out.println("VAT: " + VAT);
        System.out.println("Lợi nhuận tối thiểu: " + TY_LE_LOI_NHUAN_TOI_THIEU);
        System.out.println("Tổng sản phẩm: " + demSanPham);
    }

    // Abstract
    public abstract double tinhLoiNhuan();

    // Overloading
    public final double tinhGiaSauThue() {
        return giaBan * (1 + VAT);
    }

    public final double tinhGiaSauThue(double thueBoSung) {
        return giaBan * (1 + VAT + thueBoSung);
    }

    public void hienThiThongTin() {
        System.out.println(maSP + " - " + tenSP + " | Giá bán: " + giaBan);
    }
}

