package kethua.bai2;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private int namSinh;
    private double luongCoBan;

    public NhanVien(String maNV, String hoTen, int namSinh, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int tinhTuoi() {
        return (2024 - namSinh);
    }

    abstract double tinhLuong();

    public void hienThiThongTin() {
        System.out.println("Ma nhan vien" + maNV);
        System.out.println("Ho ten" + hoTen);
        System.out.println("Nam sinh" + namSinh);
        System.out.println("Luong co ban" + luongCoBan);
    }
}
