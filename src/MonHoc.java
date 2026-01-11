public class MonHoc {
    int maMon;
    String tenMon;
    int soTinChi;
    double diemThi;
    void hienThiThongTin () {
        System.out.println("maMon" + maMon);
        System.out.println("tenMon" + tenMon);
        System.out.println("soTinChi" + soTinChi);
        System.out.println("diemThi" + diemThi);
    }
    boolean laSoTinChi() {
        if(soTinChi>=3){
            return true;
        }
        return false;
    }

    boolean daThi() {
        if(diemThi>=0){
            return true;
        }
        return false;
    }

    boolean daQua() {
        if(diemThi>=5.0){
            return true;
        }
        return false;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }
}

