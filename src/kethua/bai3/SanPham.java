package kethua.bai3;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double giaBan;
    private int soLuongTon;

    public SanPham(String maSP, String tenSP, double giaBan, int soLuongTon) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan>0) {
            this.giaBan = giaBan;
        }
        System.out.println("Gia ban ko hop le");
    }

    public void nhapKho(int soLuong) {
        if (soLuong>0) {
            soLuongTon += soLuong;
        }
        System.out.println("So luong nhap phai lon hon 0");
    }

    public void xuatKho(int soLuong) {
        if (soLuong<=0) {
            System.out.println("So luong xuat phai lon hon 0");
        } else if (soLuong>soLuongTon) {
            System.out.println("Kho ko du hang");
        }
        soLuongTon -= soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP" + tenSP);
        System.out.println("Gia ban" + giaBan);
        System.out.println("So luong ton" + soLuongTon);
    }
}
