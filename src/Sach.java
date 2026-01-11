public class Sach {
    String maSach;
    String tenSach;
    String tacGia;
    int namXuatBan;
    double giaBan;

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaBan = giaBan;
    }

    void hienThiThongTin() {
        System.out.println("maSach" + maSach);
        System.out.println("tenMon" + tenSach);
        System.out.println("tacGia" + tacGia);
        System.out.println("namXuatBan" + namXuatBan);
        System.out.println("giaBan = " + giaBan);
    }

    boolean laSachCu() {
        if (namXuatBan < 2010) {
            return true;
        }
        return false;
    }

    int tinhTuoi() {
        return 2024 - namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}