public class CauLacBo {
    String maCLB;
    String tenCLB;
    int soThanhVien;
    int soThanhVienToiDa;
    double soTienQuy;
    double phiThanhVien;

    public CauLacBo(String maCLB, String tenCLB, int soThanhVien, int soThanhVienToiDa, double soTienQuy, double phiThanhVien) {
        this.maCLB = maCLB;
        this.tenCLB = tenCLB;
        this.soThanhVien = soThanhVien;
        this.soThanhVienToiDa = soThanhVienToiDa;
        this.soTienQuy = soTienQuy;
        this.phiThanhVien = phiThanhVien;
    }

    void hienThiThongTin () {
        System.out.println("maCLB" + maCLB);
        System.out.println("tenCLB" + tenCLB);
        System.out.println("soThanhVien" + soThanhVien);
        System.out.println("soThanhVienToiDa" + soThanhVienToiDa);
        System.out.println("soTienQuy" + soTienQuy);
        System.out.println("phiThanhVien" + phiThanhVien);
    }

    boolean conChoNhanTV () {
        if (soThanhVien < soThanhVienToiDa) {
            return true;
        }
        return false;
    }

    int soChoConLai () {
        return (soThanhVienToiDa - soThanhVien);
    }

    void themThanhVien (int soLuong) {
        if (soThanhVien + soLuong <= soThanhVienToiDa) {
            soThanhVien += soLuong;
            soTienQuy += soLuong * phiThanhVien;

            System.out.println(" Them thanh cong " + soLuong + " thanh vien");
            System.out.println(" So thanh vien hien co: " + soThanhVien);
            System.out.println(" So tien thu phi: " + phiThanhVien);

        } else {
            System.out.println("CLB đa đu thanh vien");
        }
    }

    void thanhVienRoi (int soLuong) {
        if (soLuong <= soThanhVien) {
            soThanhVien -= soLuong;
        } else {
            soThanhVien = 0; }
    }

    void chiTieu(double soTien) {
        if (soTien <= soTienQuy) {
            soTienQuy -= soTien;
        } else {
            System.out.println(" Quy khong đu tien");
        }
    }

    double quyenGop(double soTien) {
        return (soTien + soTienQuy);
    }

    boolean laCLBLon() {
        if (soThanhVien >=30) {
            return true;
        }
        return false;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public void setMaCLB(String maCLB) {
        this.maCLB = maCLB;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public void setTenCLB(String tenCLB) {
        this.tenCLB = tenCLB;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoThanhVienToiDa() {
        return soThanhVienToiDa;
    }

    public void setSoThanhVienToiDa(int soThanhVienToiDa) {
        this.soThanhVienToiDa = soThanhVienToiDa;
    }

    public double getSoTienQuy() {
        return soTienQuy;
    }

    public void setSoTienQuy(double soTienQuy) {
        this.soTienQuy = soTienQuy;
    }

    public double getPhiThanhVien() {
        return phiThanhVien;
    }

    public void setPhiThanhVien(double phiThanhVien) {
        this.phiThanhVien = phiThanhVien;
    }
}
