package kethua.truonghoc;

public class SinhVienDaiHoc extends SinhVien{

    private String nganh;
    private int soTinChi;

    public SinhVienDaiHoc(String maSV, String hoTen, int namSinh, double diemTrungBinh, String nganh, int soTinChi) {
        super(maSV, hoTen, namSinh, diemTrungBinh);
        this.nganh = nganh;
        this.soTinChi = soTinChi;
    }

    @Override
    public double tinhHocPhi() {
        return soTinChi * 500000;
    }

    @Override
    public String xepLoai() {
        return super.xepLoai();
    }

    // Overloading riêng
    public void dangKyMonHoc(int soTinChiMoi) {
        soTinChi += soTinChiMoi;
        System.out.println("Da dang ky them: " + soTinChiMoi);
    }

    public void dangKyMonHoc(String tenMon, int soTinChiMon) {
        soTinChi += soTinChiMon;
        System.out.println("Da dang ky mon: " + tenMon + soTinChiMon);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh: " + nganh);
        System.out.println("So tin chi: " + soTinChi);
    }
}
