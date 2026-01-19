package kethua.xeco;

public class Xe {
    private String bienSo;
    private String hangXe;
    private int namSanXuat;
    private double giaBan;

    public Xe(String bienSo, String hangXe) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
    }

    public Xe(String bienSo, String hangXe, int namSanXuat, double giaBan) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    public String getBienSo() {
        return bienSo;
    }

    public String getHangXe() {
        return hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setHangXe(String hangXe) {
        if (hangXe != null){
            this.hangXe = hangXe;
        }
    }

    public void setGiaBan(double giaBan) {
        if (giaBan>=0) {
            this.giaBan = giaBan;
        }
    }

    public int tinhTuoi() {
        return (2024-namSanXuat);
    }

    public double tinhKhauHao() {
        double ketQua = tinhKhauHao(0.1);
        return ketQua;
    }

    public double tinhKhauHao(double tyLe) {
        int tuoi = tinhTuoi();
        double giaConLai = giaBan;
        for (int i=0; i<tuoi;i++) {
            giaConLai = giaConLai * (1-tyLe);
        }
        return giaConLai;
    }

    public double tinhKhauHao(int soNam) {
        double giaConLai = giaBan;
        for (int i=0; i<soNam; i++) {
            giaConLai = giaConLai *(1-0.1);
        }
        return giaConLai;
    }

    public void hienThiThongTin() {
        System.out.println("Bien so: " + bienSo);
        System.out.println("Hang xe: " + hangXe);
        System.out.println("Nam san xuat: " + namSanXuat);
        System.out.println("Gia ban: " + giaBan);
    }


}
