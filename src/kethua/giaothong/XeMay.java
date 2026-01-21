package kethua.giaothong;

public class XeMay extends PhuongTien{

    private String loaiXe;
    private int phanKhoi;

    public XeMay(String bienSoXe, String hangSanXuat, int namSanXuat, double giaBan, String loaiXe, int phanKhoi) {
        super(bienSoXe, hangSanXuat, namSanXuat, giaBan);
        this.loaiXe = loaiXe;
        this.phanKhoi = phanKhoi;
    }

    @Override
    public double tinhThueHangNam() {
        if (phanKhoi <= 150) {
            return getGiaBan() * 0.01;
        }
            return getGiaBan() * 0.015;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loai xe: " + loaiXe);
        System.out.println("Phan khoi: " + phanKhoi);
    }
}
