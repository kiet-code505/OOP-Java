package quanly.hocsinh;

public class HocSinh {
    private String maHS;
    private String hoTen;
    private String lop;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh() {
    }

    public HocSinh(String maHS, String hoTen, String lop) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public HocSinh(String maHS, String hoTen, String lop, double diemToan, double diemVan, double diemAnh) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String getMaHS() {
        return maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setHoTen(String hoTen) {
        if (hoTen != null || hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        }
        else {
            System.out.println("Ho ten ko hop le");
        }
    }

    public void setLop(String lop) {
        if (lop != null || lop.trim().isEmpty()) {
            this.lop = lop;
        }
        else {
            System.out.println("Lop ko hop le");
        }
    }

    public void setDiemToan(double diemToan) {
        if (diemToan>10 || diemToan<0) {
            System.out.println("Diem toan ko hop le");
        }
        else {
            this.diemToan = diemToan;
        }
    }

    public void setDiemVan(double diemVan) {
        if (diemVan>10 || diemVan<0) {
            System.out.println("Diem Van ko hop le");
        }
        else {
            this.diemVan = diemVan;
        }
    }

    public void setDiemAnh(double diemAnh) {
        if (diemAnh>10 || diemAnh<0) {
            System.out.println("Diem Anh ko hop le");
        }
        else {
            this.diemAnh = diemAnh;
        }
    }

    public double tinhDiemTrungBinh() {
        return (diemAnh+diemVan+diemToan)/3;
    }

    public void xepLoai(){
        double dtb = tinhDiemTrungBinh();
        if (dtb >=8) {
            System.out.println("Gioi");
        }else if (dtb >6.5) {
            System.out.println("Kha");
        } else if (dtb>=5) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma hoc sinh: " + maHS);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Van: " + diemVan);
        System.out.println("Diem Anh: " + diemAnh);
    }
}
