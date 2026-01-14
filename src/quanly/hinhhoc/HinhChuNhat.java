package quanly.hinhhoc;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        this(1.0, 1.0);
    }

    public HinhChuNhat(double canh) {
        this(canh, canh);
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai>0) {
            this.chieuDai = chieuDai;
        }
        System.out.println("Chieu dai ko hop le");
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong>0) {
            this.chieuRong = chieuRong;
        }
        System.out.println("Chieu rong ko hop le");
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong)*2;
    }

    public boolean laHinhVuong() {
        return chieuDai == chieuRong;
    }

    public int soSanh(HinhChuNhat khac) {
        return Double.compare(this.tinhDienTich(), khac.tinhDienTich());
    }

    public void hienThi() {
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("La hinh vuong: " + laHinhVuong());
    }
}
