package kethua.nganhang;

public class TaiKhoanTietKiem extends TaiKhoan {

    private int kyHan;
    private double laiSuat;
    private String ngayBatDau;

    public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, String ngayMoTaiKhoan, int kyHan, double laiSuat, String ngayBatDau) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu, ngayMoTaiKhoan);
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.ngayBatDau = ngayBatDau;
    }

    @Override
    public double rutTien(double soTien) {
        System.out.println("Khong cho rut truoc han");
        return getSoDu();
    }

    public double tinhLai() {

        return getSoDu() * (laiSuat / 100) * kyHan / 12;
    }

    public double tinhLai(int soThang) {

        return getSoDu() * (laiSuat / 100) * soThang / 12;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ky han: " + kyHan + " thang");
        System.out.println("Lai suat: " + laiSuat + "%");
        System.out.println("Ngay bat dau: " + ngayBatDau);
        System.out.println("Tien lai: " + tinhLai());
    }
}
