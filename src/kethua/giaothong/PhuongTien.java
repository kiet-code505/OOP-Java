package kethua.giaothong;

public abstract class PhuongTien {
    private String bienSoXe;
    private String hangSanXuat;
    private int namSanXuat;
    private double giaBan;

    public PhuongTien(String bienSoXe, String hangSanXuat, int namSanXuat) {
        this.bienSoXe = bienSoXe;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan =0;
    }

    public PhuongTien(String bienSoXe, String hangSanXuat, int namSanXuat, double giaBan) {
        this.bienSoXe = bienSoXe;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public abstract double tinhThueHangNam();

    public void hienThiThongTin() {
        System.out.println("Bien so: " + bienSoXe);
        System.out.println("Hang SX: " + hangSanXuat);
        System.out.println("Nam SX: " + namSanXuat);
        System.out.println("Gia ban: " + giaBan);
    }

    public void hienThiThongTin(boolean chiTiet) {
        hienThiThongTin();
        if (chiTiet) {
            System.out.println("Thue hang nam: " + tinhThueHangNam());
        }
    }
}
