package kethua.truonghoc;

public class SinhVienCaoDang extends SinhVien{

    private String chuyenNganh;
    private double hocPhiCoSo;
    public SinhVienCaoDang(String maSV, String hoTen, int namSinh, double diemTrungBinh, String chuyenNganh, double hocPhiCoSo) {
        super(maSV, hoTen, namSinh, diemTrungBinh);
        this.chuyenNganh = chuyenNganh;
        this.hocPhiCoSo = hocPhiCoSo;
    }

    @Override
    public double tinhHocPhi() {
        if (getDiemTrungBinh() >= 8.0)
            return hocPhiCoSo * 0.7;
        if (getDiemTrungBinh() >= 6.5)
            return hocPhiCoSo * 0.9;
        return hocPhiCoSo;
    }

    @Override
    public String xepLoai() {
        if (getDiemTrungBinh() >= 8.0) return "Gioi";
        if (getDiemTrungBinh() >= 6.5) return "Kha";
        if (getDiemTrungBinh() >= 5.0) return "Trung binh";
        return "Yeu";
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("Hoc phi co so: " + hocPhiCoSo);
    }
}
