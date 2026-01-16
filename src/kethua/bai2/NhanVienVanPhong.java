package kethua.bai2;

public class NhanVienVanPhong extends NhanVien{

    private int soNgayLamViec;
    private double phuCapPhucVu;

    public NhanVienVanPhong(String maNV, String hoTen, int namSinh, double luongCoBan) {
        super(maNV, hoTen, namSinh, luongCoBan);
    }

    @Override
    double tinhLuong() {
        return (super.getLuongCoBan()+(soNgayLamViec*200000));
    }

    public double tangPhuCap(double them) {
        double luong = tinhLuong();
        return luong + them;
    }
}
