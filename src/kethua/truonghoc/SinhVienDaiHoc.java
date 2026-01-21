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
        if(getDiemTrungBinh()>=8.5 && getDiemTrungBinh()<=10) {
            return "Xuat sac";
        } else if (getDiemTrungBinh()>=7.0) {
            return "Gioi";
        } else if (getDiemTrungBinh()>=5.5) {
            return "Kha";
        } else if (getDiemTrungBinh()>=4.0) {
            return "Trung binh";
        }
        return "Yeu";
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
