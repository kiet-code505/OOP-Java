package quanly.phonghoc;

public class PhongHoc {
    String maPhong;
    String tenPhong;
    int soChoNgoi;
    int soSinhVienHienTai;
    boolean coMayChieu;

    public PhongHoc(String maPhong, String tenPhong, int soChoNgoi, int soSinhVienHienTai, boolean coMayChieu) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soChoNgoi = soChoNgoi;
        this.soSinhVienHienTai = soSinhVienHienTai;
        this.coMayChieu = coMayChieu;
    }

    void hienThiThongTin() {
        System.out.println("maPhong" + maPhong);
        System.out.println("tenPhong" + tenPhong);
        System.out.println("soChoNgoi" + soChoNgoi);
        System.out.println("soSinhVienHienTai" + soSinhVienHienTai);
        System.out.println("coMayChieu " + coMayChieu);
    }

    boolean laPhongLon() {
        return soChoNgoi >= 50;
    }

    boolean conCho() {
        return soSinhVienHienTai < soChoNgoi;
    }

    int soChoTrong() {
        return soChoNgoi - soSinhVienHienTai;
    }

    void themSinhVien(int soLuong) {
        if (soSinhVienHienTai + soLuong <= soChoNgoi) {
            soSinhVienHienTai += soLuong;
        }
    }

    void sinhVienRaVe(int soLuong) {
        if (soLuong <= soSinhVienHienTai) {
            soSinhVienHienTai -= soLuong;
        } else {
            soSinhVienHienTai = 0;
        }
    }

    double tinhTyLeLapDay() {
        return (double) soSinhVienHienTai / soChoNgoi * 100;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public int getSoSinhVienHienTai() {
        return soSinhVienHienTai;
    }

    public void setSoSinhVienHienTai(int soSinhVienHienTai) {
        this.soSinhVienHienTai = soSinhVienHienTai;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }
}
