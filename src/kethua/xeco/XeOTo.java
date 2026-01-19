package kethua.xeco;

public class XeOTo extends Xe{
    private int soChoNgoi;
    private String kieuDongCo;
    public XeOTo(String bienSo, String hangXe, int namSanXuat, double giaBan, int soChoNgoi, String kieuDongCo) {
        super(bienSo, hangXe, namSanXuat, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public double tinhKhauHao() {
        double ketQua = tinhKhauHao(0.8);
        return ketQua;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So cho ngoi: " + soChoNgoi);
        System.out.println("Kieu dong co: " + kieuDongCo);
    }

    public double tinhThueHangNam() {
        double ketQua = getGiaBan()*(1-0.02);
        return ketQua;
    }

    public double tinhThueHangNam(boolean giamThue) {
        double ketQua = tinhThueHangNam();
        if (getHangXe().equals("Dien")) {
            return ketQua * 0.5;
        }
        return ketQua;
    }
}
