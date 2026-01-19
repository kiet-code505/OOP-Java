package kethua.xeco;

public class TestXeCo {
    public static void main(String[] args) {
        XeMay xemay1 = new XeMay("29H1-23456","Yamaha",2023,45,155,"Tay con");
        XeOTo xeoto1 = new XeOTo("51A-98765","Mercedes",2022,1.5,5,"Hybird");

        xemay1.hienThiThongTin();
        xeoto1.hienThiThongTin();

        System.out.println(xemay1.tinhKhauHao());
        System.out.println(xeoto1.tinhKhauHao());

        System.out.println(xemay1.tinhGiaThue());
        System.out.println(xeoto1.tinhThueHangNam(true));

        xemay1.setHangXe("Honda");
        xeoto1.setGiaBan(1.2);

        System.out.println(xemay1.tinhTuoi());
        System.out.println(xeoto1.tinhTuoi());

        System.out.println(xemay1.getBienSo());


    }
}
