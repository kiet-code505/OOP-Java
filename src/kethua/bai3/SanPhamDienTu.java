package kethua.bai3;

public class SanPhamDienTu extends SanPham {
    private int thoiGianBaoHanh;
    public SanPhamDienTu(String maSP, String tenSP, double giaBan, int soLuongTon) {
        super(maSP, tenSP, giaBan, soLuongTon);
    }

    public int thoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
}
