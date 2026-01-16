package kethua.bai2;

public class QuanLy extends NhanVien{

    private int soNhanVienQuanLy;
    private double phuCapQuanLy;
    private double thuongHieuQua;

    public QuanLy(String maNV, String hoTen, int namSinh, double luongCoBan) {
        super(maNV, hoTen, namSinh, luongCoBan);
    }

    @Override
    double tinhLuong() {
        return getLuongCoBan()+phuCapQuanLy+(soNhanVienQuanLy*500000)+thuongHieuQua;
    }

    double tangThuong(double them) {
        return thuongHieuQua + them;
    }

    int themNhanVien(int them) {
        return soNhanVienQuanLy + them;
    }
}
