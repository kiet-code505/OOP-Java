public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.setChieuDai(6);
        hcn1.setChieuRong(5);
        System.out.println(hcn1.tinhChuVi());
        System.out.println(hcn1.tinhDienTich());
        hcn1.hienThiThongTin();
    }

}
