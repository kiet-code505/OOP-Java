package quanly.hinhchunhat;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    double tinhDienTich() {
        double result = chieuDai * chieuRong;
        return result;
    }

    double tinhChuVi() {
        double result = (chieuDai + chieuRong) * 2;
        return result;
    }
    void hienThiThongTin () {
        System.out.println("chieuDai = " + chieuDai);
        System.out.println("chieuRong = " + chieuRong);
    }


}

