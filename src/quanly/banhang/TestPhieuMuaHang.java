package quanly.banhang;

public class TestPhieuMuaHang {
    public static void main(String[] args) {
        PhieuMuaHang phieumuahang1 = new PhieuMuaHang("123","12/6/2004","Kiet","Keo");
        PhieuMuaHang phieumuahang2 = new PhieuMuaHang("234","12/7/2004","Khoa","Banh");
        PhieuMuaHang phieumuahang3 = new PhieuMuaHang("345","12/8/2004","Anh","Nuoc");

        phieumuahang1.setDonGia(10000);
        phieumuahang2.setSoLuong(6);
        phieumuahang3.setGiamGia(3);

        phieumuahang1.hienThiThongTin();
        phieumuahang2.hienThiThongTin();
        phieumuahang3.hienThiThongTin();
    }
}
