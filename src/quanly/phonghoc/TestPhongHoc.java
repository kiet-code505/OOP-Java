package quanly.phonghoc;

public class TestPhongHoc {
    public static void main(String[] args) {

        PhongHoc phonghoc1 = new PhongHoc("01", "123", 5, 12, true);
        PhongHoc phonghoc2 = new PhongHoc("02", "124", 6, 13, false);
        PhongHoc phonghoc3 = new PhongHoc("03", "125", 7, 14, true);

        System.out.println("Hien thi thong tin");
        phonghoc1.hienThiThongTin();
        phonghoc2.hienThiThongTin();
        phonghoc3.hienThiThongTin();

        System.out.println("Thu them sinh vien vao phong");
        phonghoc1.themSinhVien(7);
        phonghoc1.hienThiThongTin();

        System.out.println("Thu cho sinh vien ra ve");
        phonghoc2.sinhVienRaVe(4);
        phonghoc2.hienThiThongTin();

        System.out.println("Kiem tra phong nao con cho");
        System.out.println("Phong 3 con cho? " + phonghoc3.conCho());

        System.out.println("Tinh ty le lap day");
        System.out.println("Ty le lap day phong 2: " + phonghoc2.tinhTyLeLapDay());
    }
}
