public class TestCLB {
    public static void main(String[] args) {

        CauLacBo caulacbo1 = new CauLacBo("01","Kiet", 5, 12, 10000, 5000);
        CauLacBo caulacbo2 = new CauLacBo("02","Anh", 6, 12, 20000, 6000);
        CauLacBo caulacbo3 = new CauLacBo("03","Khoa", 7, 12, 30000, 7000);

        System.out.println("Them thanh vien");
        caulacbo1.themThanhVien(4);
        caulacbo1.hienThiThongTin();

        System.out.println("Bot thanh vien");
        caulacbo2.thanhVienRoi(3);
        caulacbo2.hienThiThongTin();

        System.out.println("Chi tieu");
        caulacbo3.chiTieu(10000);
        caulacbo3.hienThiThongTin();

        System.out.println("Quyen gop");
        double quyenGop = caulacbo2.quyenGop(5000);
        System.out.println("So tien quy sau quyen gop: " + quyenGop);
        caulacbo2.hienThiThongTin();
    }
}
