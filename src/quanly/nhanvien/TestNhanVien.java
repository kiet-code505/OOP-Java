package quanly.nhanvien;

import java.util.ArrayList;
import java.util.List;

public class TestNhanVien {
    public static void main(String[] args) {
        System.out.println("Tao 3 nhan vien");
        NhanVien nhanvien1 = new NhanVien("01", "Ngoc Anh", 31, 100000,1.5);
        NhanVien nhanvien2 = new NhanVien("02", "Anh Tuan", 32, 200000,2.5);
        NhanVien nhanvien3 = new NhanVien("03", "Van Toan", 52, 300000,3.5);

        System.out.println("Hien thi thong tin va luong");
        nhanvien1.hienThiThongTin();
        System.out.println(nhanvien1.tinhLuong());
        nhanvien2.hienThiThongTin();
        System.out.println(nhanvien2.tinhLuong());
        nhanvien3.hienThiThongTin();
        System.out.println(nhanvien3.tinhLuong());

        System.out.println("Tang luong 10% cho nhan vien thu hai");
        double tangLuong = nhanvien2.tangluong(0.1);
        nhanvien2.setLuongCoBan(tangLuong);
        nhanvien2.hienThiThongTin();

        List<NhanVien> list = new ArrayList<>();
        list.add(nhanvien1);
        list.add(nhanvien2);
        list.add(nhanvien3);
        for(int i = 0; i<list.size();i++) {
            if (list.get(i).laNhanVienGia()) {
                list.get(i).hienThiThongTin();
            }
        }
    }
}
