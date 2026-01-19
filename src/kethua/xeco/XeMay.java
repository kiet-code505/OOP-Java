package kethua.xeco;

public class XeMay extends Xe {
    private int congSuat;
    private String loaiXe;
    public XeMay(String bienSo, String hangXe, int namSanXuat, double giaBan, int congSuat, String loaiXe) {
        super(bienSo, hangXe, namSanXuat, giaBan);
        this.congSuat = congSuat;
        this.loaiXe = loaiXe;
    }

    @Override
    public double tinhKhauHao() {
        double ketQua = tinhKhauHao(0.15);
        return ketQua;
    }

    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Cong suat: " + congSuat);
        System.out.println("Loai xe: " + loaiXe);
    }

    public double tinhGiaThue() {
        return 100000;
    }

    public double tinhGiaThue(int soNgay) {
        if (soNgay>=7) {
//            double ketQua = tinhGiaThue()*soNgay*(1-0.1);
            return tinhGiaThue()*soNgay*(1-0.1);
        } else {
            return tinhGiaThue()*soNgay;
        }
    }


}
