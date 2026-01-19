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
        }
        return soTien;
    }

    public void chuyenKhoan (String soTKNhan, double soTien, String noiDung) {
        System.out.println("Noi dung: " + noiDung);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So the: " + soThe);
        System.out.println("Han muc rut: " + hanMucRut);
    }
}
