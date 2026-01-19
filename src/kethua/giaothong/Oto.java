package kethua.giaothong;

public class Oto extends PhuongTien{

    private int soChoNgoi;
    private double dungTichDongCo;

    public Oto(String bienSoXe, String hangSanXuat, int namSanXuat, double giaBan, int soChoNgoi, double dungTichDongCo) {
        super(bienSoXe, hangSanXuat, namSanXuat, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.dungTichDongCo = dungTichDongCo;
    }

    @Override
    public double tinhThueHangNam() {
        return getGiaBan()*0.02;
    }

    public double tinhChPhiNhieuLieu(double quangDuong) {
        double tieuThu = 8;
        return (quangDuong / 100) * tieuThu * 25000;
    }

    public double tinhChiPhiNhienLieu(double quangDuong, double giaXang) {
        double tieuThu = 8;
        return (quangDuong / 100) * tieuThu * giaXang;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So cho ngoi: " + soChoNgoi);
        System.out.println("Dung tich dong co: " + dungTichDongCo);
    }
}
