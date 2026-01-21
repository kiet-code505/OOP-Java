package kethua.cuahang;

public class LapTop extends SanPham{
    private final String cpu;
    private int ram;
    private int ssd;

    private static int demLapTop = 0;

    public static final int GIA_NANG_CAP_RAM = 500000;
    public static final int GIA_NANG_CAP_SSD = 300000;

    public LapTop(String ma, String ten, double giaNhap, double giaBan,
                  String cpu, int ram, int ssd) {
        super(ma, ten, giaNhap, giaBan);
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        demLapTop++;
    }

    public static int getDemLapTop() {
        return demLapTop;
    }

    public static double tinhGiaNangCap(int ramThem, int ssdThem) {
        return ramThem * GIA_NANG_CAP_RAM + ssdThem * GIA_NANG_CAP_SSD;
    }

    @Override
    public double tinhLoiNhuan() {
        return (getGiaBan() - getGiaNhap()) * 0.9;
    }

    // Overloading
    public void nangCapLapTop(int ramThem) {
        ram += ramThem;
    }

    public void nangCapLapTop(int ramThem, int ssdThem) {
        ram += ramThem;
        ssd += ssdThem;
        setGiaBan(getGiaBan() + tinhGiaNangCap(ramThem, ssdThem));
    }

    public String getCauHinh() {
        return "CPU: " + cpu + ", RAM: " + ram + "GB, SSD: " + ssd + "GB";
    }
}
