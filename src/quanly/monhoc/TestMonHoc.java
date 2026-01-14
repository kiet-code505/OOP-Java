package quanly.monhoc;

public class TestMonHoc {
    public static void main(String[] args) {
        MonHoc monToan = new MonHoc();
        monToan.setMaMon(100);
        monToan.setTenMon("Toan");
        monToan.setSoTinChi(23);
        monToan.setDiemThi(32);
        monToan.hienThiThongTin();
        System.out.println(monToan.laSoTinChi());
        System.out.println(monToan.daThi());
        System.out.println(monToan.daQua());
    }
}
