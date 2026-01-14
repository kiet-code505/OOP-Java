package quanly.banhang;

public class PhieuMuaHang {
    private String maPhieu;
    private String ngayMua;
    private String tenKhachHang;
    private String tenSanPham;
    private double donGia;
    private int soLuong;
    private double giamGia;

    public PhieuMuaHang(String maPhieu, String ngayMua,
                        String tenKhachHang, String tenSanPham) {
        this(maPhieu, ngayMua, tenKhachHang, tenSanPham, 0, 1, 0);
    }

    public PhieuMuaHang(String maPhieu, String ngayMua, String tenKhachHang, String tenSanPham, double donGia, int soLuong, double giamGia) {
        this.maPhieu = maPhieu;
        this.ngayMua = ngayMua;
        this.tenKhachHang = tenKhachHang;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.giamGia = giamGia;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTenKhachHang(String tenKhachHang) {
        if (tenKhachHang != null || tenKhachHang.trim().isEmpty()) {
            this.tenKhachHang = tenKhachHang;
        }
        System.out.println("Hay dien ten day du");
    }

    public void setTenSanPham(String tenSanPham) {
        if (tenSanPham != null || tenSanPham.trim().isEmpty()) {
            this.tenSanPham = tenSanPham;
        }
        System.out.println("Hay dien ten san pham");
    }

    public void setDonGia(double donGia) {
        if (donGia>0) {
            this.donGia = donGia;
        }
        System.out.println("Don gia ko hop le");
    }

    public void setSoLuong(int soLuong) {
        if (soLuong>0) {
            this.soLuong = soLuong;
        }
        System.out.println("So luong ko hop le");
    }

    public void setGiamGia(double giamGia) {
        if (giamGia>=0 && giamGia<=100) {
            this.giamGia = giamGia;
        }
        System.out.println("Ko giam gia");
    }

    public double tinhThanhTien() {
        return (donGia*soLuong);
    }

    public double tinhTienGiamGia() {
        return (tinhThanhTien()*giamGia/100);
    }

    public double tinhTienPhaiTra() {
        return (tinhThanhTien()-tinhTienGiamGia());
    }

    public void hienThiThongTin() {
        System.out.println("Ma phieu: " + maPhieu);
        System.out.println("Ngay mua: " + ngayMua);
        System.out.println("Ten khach hang: " + tenKhachHang);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thanh tien: " + tinhThanhTien());
        System.out.println("Tien giam: " + tinhTienGiamGia());
        System.out.println("Tien tra: " + tinhTienPhaiTra());
    }
}
