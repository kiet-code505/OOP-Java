package quanly.nhanvien;

public class NhanVien {
    String maNv;
    String hoTen;
    int tuoi;
    double luongCoBan;
    double heSoLuong;

    public NhanVien(String maNv, String hoTen, int tuoi, double luongCoBan, double heSoLuong) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    void hienThiThongTin() {
        System.out.println("maNv" + maNv);
        System.out.println("hoTen" + hoTen);
        System.out.println("tuoi" + tuoi);
        System.out.println("luongCoBan" + luongCoBan);
        System.out.println("heSoLuong " + heSoLuong);
    }

    double tinhLuong() {
        return (luongCoBan*heSoLuong);
    }
    double tangluong(double phanTram) {
        return (luongCoBan + luongCoBan*phanTram);
    }
    boolean laNhanVienGia() {
        if (tuoi>=50) {
            return true;
        }
        return false;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
