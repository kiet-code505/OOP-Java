package kethua.cuahang;

public class DienThoai extends SanPham{
    private String hangSanXuat;
    private int thoiGianBaoHanh;

    private static int demDienThoai = 0;
    public static final int BAO_HANH_MAC_DINH = 12;

    public DienThoai(String ma, String ten, double giaNhap, double giaBan,
                     String hang, int baoHanh) {
        super(ma, ten, giaNhap, giaBan);
        this.hangSanXuat = hang;
        this.thoiGianBaoHanh = baoHanh;
        demDienThoai++;
    }

    public static int getDemDienThoai() {
        return demDienThoai;
    }

    @Override
    public double tinhLoiNhuan() {
        return (getGiaBan() - getGiaNhap()) * 0.95;
    }

    public void tangBaoHanh() {
        thoiGianBaoHanh += BAO_HANH_MAC_DINH;
    }

    public void tangBaoHanh(int them) {
        thoiGianBaoHanh += them;
    }

    public String kiemTraConBaoHanh(int thangDaDung) {
        return thangDaDung < thoiGianBaoHanh ? "Còn bảo hành" : "Hết bảo hành";
    }
}
