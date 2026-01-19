package kethua.truonghoc;

public class TestSinhVien {
    public static void main(String[] args) {
        SinhVienDaiHoc svDH = new SinhVienDaiHoc("DH001", "Nguyễn Văn A", 2003,8.5,"Công nghệ thông tin", 120);
        SinhVienCaoDang svCD = new SinhVienCaoDang("CD001", "Trần Thị B", 2004, 7.2, "Kế toán", 15000000);

        System.out.println("Sinh vien dai hoc");
        svDH.hienThiThongTin();
        System.out.println("Xep loai: " + svDH.xepLoai());
        System.out.println("Hoc phi: " + svDH.tinhHocPhi());

        System.out.println("Sinh vien cao dang");
        svCD.hienThiThongTin();
        System.out.println("Xep loai: " + svCD.xepLoai());
        System.out.println("Hoc phi: " + svCD.tinhHocPhi());

        System.out.println("Dang ky mon hoc");
        svDH.dangKyMonHoc("Tri tue nhan tao", 3);

        System.out.println("Cap nhap diem");
        svCD.setDiemTrungBinh(8.3);
        System.out.println("Hoc phi sau khi giam: " + svCD.tinhHocPhi());

        System.out.println("Xep loai theo hoc ky");
        svDH.xepLoai("HK1-2024");
    }
}
