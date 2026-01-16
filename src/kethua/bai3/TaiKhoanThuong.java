package kethua.bai3;

public class TaiKhoanThuong extends TaiKhoan {
    private double phiduytri = 50000;

    public TaiKhoanThuong(String tenChuThe, double soDu) {
        super(tenChuThe, soDu);
    }

    public double getPhiDuyTri() {
        return phiduytri;
    }
}
