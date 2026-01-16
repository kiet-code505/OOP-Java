package kethua.bai1;

public class HinhChuNhat {
    private int dai;
    private int rong;

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int tinhChuVi() {
        return (dai + rong)*2;
    }

    public int tinhDienTich() {
        return (dai*rong);
    }

}
