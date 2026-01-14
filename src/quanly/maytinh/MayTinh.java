package quanly.maytinh;

public class MayTinh {
    String maMay;
    String hang;
    String cpu;
    int ram;
    double gia;

    public MayTinh(String maMay, String hang, String cpu, int ram, double gia) {
        this.maMay = maMay;
        this.hang = hang;
        this.cpu = cpu;
        this.ram = ram;
        this.gia = gia;
    }

    void hienThiThongTin() {
        System.out.println("maMay" + maMay);
        System.out.println("hang" + hang);
        System.out.println("cpu" + cpu);
        System.out.println("ram" + ram);
        System.out.println("gia " + gia);
    }

    boolean laMayCauHinhCao() {
        if (ram>=16) {
            return true;
        }
        return false;
    }

    boolean laMayDatTien() {
        if (gia>=20) {
            return true;
        }
        return false;
    }

    double giamGia(double phanTram) {
        return (gia - gia*phanTram);
    }

    int nangCapRam(int themRam) {
        return ( ram + themRam);
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
