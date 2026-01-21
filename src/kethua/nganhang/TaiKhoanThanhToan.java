package kethua.nganhang;

public class TaiKhoanThanhToan extends TaiKhoan{

    private String soThe;
    private double hanMucRut;
    public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan,
                             double soDu, String ngayMoTaiKhoan,
                             String soThe, double hanMucRut) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu, ngayMoTaiKhoan);
        this.soThe = soThe;
        this.hanMucRut = hanMucRut;
    }


    @Override
    public double rutTien (double soTien) {
        if (soTien>hanMucRut) {
            System.out.println("Vuot muc rut tien");
            return getSoDu();
        }
        double soDu = getSoDu()-soTien;
        System.out.println("So du con lai: " + soDu);
        return soTien;
    }

    public double chuyenKhoan(String soTKhoan, double soTien) {
        if (getSoDu()>=soTien) {
            System.out.println("Chuyen tien den voi STK: " + soTKhoan);
            double soDuConLai = getSoDu()-soTien;
            return soDuConLai;
        }
        System.out.println("Chuyen khoan that bai");
        return -1;
    }

    public void chuyenKhoan (String soTKNhan, double soTien, String noiDung) {
        if (getSoDu()>=soTien) {
            System.out.println("Chuyen tien den voi STK: " + soTKNhan);
            System.out.println("Noi dung: " + noiDung);
            double soDuConLai = getSoDu()-soTien;
        }
        System.out.println("Chuyen khoan that bai");
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So the: " + soThe);
        System.out.println("Han muc rut: " + hanMucRut);
    }
}
