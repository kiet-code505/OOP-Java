package kethua.cuahang;

public class TestCuaHang {
    public static void main(String[] args) {
        SanPham.hienThiThongTinHeThong();

        DienThoai dt1 = new DienThoai(
                "DT001", "iPhone 15 Pro",
                20000000, 28000000,
                "Apple", 24);

        DienThoai dt2 = new DienThoai(
                "DT002", "Samsung S24",
                18000000, 25000000,
                "Samsung", 12);

        LapTop lt1 = new LapTop(
                "LT001", "Dell XPS 13",
                25000000, 35000000,
                "Intel i7", 16, 512);

        LapTop lt2 = new LapTop(
                "LT002", "MacBook Air M2",
                28000000, 38000000,
                "Apple M2", 8, 256);

        System.out.println("Tổng SP: " + SanPham.getDemSanPham());
        System.out.println("Điện thoại: " + DienThoai.getDemDienThoai());
        System.out.println("Laptop: " + LapTop.getDemLapTop());

        System.out.println("Giá sau VAT DT1: " + dt1.tinhGiaSauThue());
        System.out.println("Giá sau VAT + 5% DT1: " + dt1.tinhGiaSauThue(0.05));

        System.out.println("Lợi nhuận DT1: " + dt1.tinhLoiNhuan());
        System.out.println("Lợi nhuận LT1: " + lt1.tinhLoiNhuan());

        dt2.tangBaoHanh();
        dt2.tangBaoHanh(6);

        System.out.println(dt1.kiemTraConBaoHanh(20));
        System.out.println(dt1.kiemTraConBaoHanh(30));

        System.out.println("Phí nâng cấp: " +
                LapTop.tinhGiaNangCap(8, 256));

        lt2.nangCapLapTop(8, 256);
        System.out.println(lt2.getCauHinh());

        SanPham.hienThiThongTinHeThong();
    }
}
