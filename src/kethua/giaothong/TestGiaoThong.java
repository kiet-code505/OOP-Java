package kethua.giaothong;

public class TestGiaoThong {
    public static void main(String[] args) {
        Oto oto1 = new Oto("29A-12345","Toyota",2022,800000000,7,2.5);
        XeMay xemay1 = new XeMay("29X1-56789", "Honda", 2023, 50000000, "Tay ga", 150);

        System.out.println("Oto");
        oto1.hienThiThongTin(true);

        System.out.println("Xe may");
        xemay1.hienThiThongTin(true);

        System.out.println("Thue oto: " + oto1.tinhThueHangNam());
        System.out.println("Thue xe may: " + xemay1.tinhThueHangNam());

        System.out.println("Chi phi nhien lieu oto 100km: " + oto1.tinhChiPhiNhienLieu(100, 25000));

        xemay1.setGiaBan(45000000);
        System.out.println("Xe may sau khi doi gia");
        xemay1.hienThiThongTin(true);
    }
}
