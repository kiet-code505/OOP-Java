package quanly.nganhang;

public class NganHang {
    private int soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    public NganHang(int soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    double napTien (double soTien) {
        if (soTien>0) {
            return this.soDu + soTien;
        }
        System.out.println("So tien nap vao phai lon hon 0");
        return -1;
    }

    double rutTien (double soTien) {
        if (soDu<soTien) {
            System.out.println("So du ko du");
            return -1;
        }
        return soDu - soTien;
    }

    public void hienThiThongTin() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Ten chu tai khoan: " + tenChuTaiKhoan);
        System.out.println("So du: " + soDu);
    }
}
