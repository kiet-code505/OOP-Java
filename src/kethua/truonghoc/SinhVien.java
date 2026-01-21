package kethua.truonghoc;

public abstract class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien(String maSV, String hoTen) {
       this.maSV = maSV;
       this.hoTen = hoTen;
       this.namSinh =2000;
       this.diemTrungBinh=0.0;
    }

    public SinhVien(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSV() {

        return maSV;
    }

    public String getHoTen() {

        return hoTen;
    }

    public int getNamSinh() {

        return namSinh;
    }

    public double getDiemTrungBinh() {

        return diemTrungBinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        if (diemTrungBinh >= 0 && diemTrungBinh <= 10) {
            this.diemTrungBinh = diemTrungBinh;
        }
        System.out.println("Diem trung binh ko hop le");
    }

    public abstract double tinhHocPhi();

    public abstract String xepLoai();

    public void xepLoai(String hocKy) {
        System.out.println("Hoc ky: " + hocKy + " - Xep loai: " + xepLoai());
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Điem TB: " + diemTrungBinh);
    }
}
