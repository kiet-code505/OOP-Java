package kethua.nganhang;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;
    private String ngayMoTaiKhoan;

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu, String ngayMoTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
        this.ngayMoTaiKhoan = ngayMoTaiKhoan;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public String getNgayMoTaiKhoan() {
        return ngayMoTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public double napTien (double soTien) {
        if (soTien>0) {
            soDu += soTien;
        }
        return soDu;
    }

    public double napTien (double soTien, String maGiaoDich) {
        if (soTien>0) {
            soDu += soTien;
            System.out.println("Mã GD: " + maGiaoDich);
        }
        return soDu;
    }

    public double rutTien (double soTien) {
        if (soTien>0 && soTien<soDu) {
            return soDu -= soTien;
        }
        System.out.println("So tien rut ko hop le");
        return soDu;
    }

    public double rutTien (double soTien, boolean taiATM) {
        if (soTien + 1100 <= soDu) {
            soDu -= (soTien + 1100);
            return soDu;
        }
        System.out.println("So du ko du de rut ATM");
        return soDu;
    }

    public void hienThiThongTin() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + tenChuTaiKhoan);
        System.out.println("So du: " + soDu);
        System.out.println("Ngay mo tai khoan: " + ngayMoTaiKhoan);
    }


}
