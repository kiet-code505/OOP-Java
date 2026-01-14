package quanly.sanpham;

public class SanPham {
    private int maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(int maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        if (gia >=0) {
            this.gia = gia;
        }
        System.out.println("Gia tien ko dc am");
    }

    public int getSoLuong() {
        if (soLuong >=0) {
            return soLuong;
        }
        System.out.println("So luong ko the nho hon 0");
        return -1;
    }


    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double tinhThanhTien () {
        return (gia*soLuong);
    }
    public void hienThiThongTin () {
        System.out.println("ma san pham" + maSP);
        System.out.println("ten san pham" + tenSP);
        System.out.println("gia san pham" + gia);
        System.out.println("so luong san pham" + soLuong);
    }
}
