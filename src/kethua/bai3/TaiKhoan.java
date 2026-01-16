package kethua.bai3;

public class TaiKhoan {
    protected String tenChuThe;
    protected double soDu;

    public TaiKhoan(String tenChuThe, double soDu) {
        this.tenChuThe = tenChuThe;
        this.soDu = soDu;
    }

    // Tính lãi suất mặc định
    public double tinhLaiSuat() {
        return 0;
    }

    // Rút tiền mặc định (không phí)
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
        } else {
            System.out.println("❌ Số tiền rút không hợp lệ");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Chủ tài khoản: " + tenChuThe);
        System.out.println("Số dư: " + soDu);
        System.out.println("Lãi suất: " + tinhLaiSuat());
    }
}
