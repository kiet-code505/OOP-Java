import java.util.ArrayList;
import java.util.List;

public class TestMayTinh {
    public static void main(String[] args) {
        MayTinh maytinh1 = new MayTinh("01","MSI","intel",13, 12000);
        MayTinh maytinh2 = new MayTinh("02","MST","intey",14, 13000);
        MayTinh maytinh3 = new MayTinh("03","MSY","inteo",15, 14000);
        System.out.println("hien thi thong tin");
        maytinh1.hienThiThongTin();
        maytinh2.hienThiThongTin();
        maytinh3.hienThiThongTin();
        System.out.println("Nang cap RAM cho may thu nhat");
        int nangCapRamMay1 = maytinh1.nangCapRam(5);
        maytinh1.setRam(nangCapRamMay1);
        maytinh1.hienThiThongTin();
        System.out.println("Giam gia 15% cho may thu hai");
        double giamGiaMay2 = maytinh2.giamGia(0.15);
        maytinh2.setGia(giamGiaMay2);
        maytinh2.hienThiThongTin();
        System.out.println("May cau hinh cao");
        List<MayTinh> mayTinhList = new ArrayList<>();
        for (int i=0; i<mayTinhList.size(); i++) {
            if (mayTinhList.get(i).laMayCauHinhCao()) {
                mayTinhList.get(i).hienThiThongTin();
            }
        }
        System.out.println("May dat tien");
        for (int i=0; i<mayTinhList.size(); i++) {
            if (mayTinhList.get(i).laMayDatTien()) {
                mayTinhList.get(i).hienThiThongTin();
            }
        }
    }
}
