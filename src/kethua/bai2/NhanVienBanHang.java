package kethua.bai2;

public class NhanVienBanHang extends NhanVien{
    private double doanhSo;
    private double tyLeHoaHong;

    public NhanVienBanHang(String maNV, String hoTen, int namSinh, double luongCoBan) {
        super(maNV, hoTen, namSinh, luongCoBan);
    }

    @Override
    double tinhLuong() {
        return (super.getLuongCoBan()+(doanhSo*tyLeHoaHong));
    }

    public double themDoanhSo (double them) {
        return doanhSo + them;
    }

    public void xepHang() {
        if (doanhSo>=100000000) {
            System.out.println("Kim cuong");
        } else if (doanhSo>=50000000) {
            System.out.println("Vang");
        } else if (doanhSo>=20000000) {
            System.out.println("Bac");
        }
        System.out.println("Dong");
    }
}
