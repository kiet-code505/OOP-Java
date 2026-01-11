import java.util.ArrayList;
import java.util.List;

public class TestSach {
    public static void main(String[] args) {
        Sach sach1 = new Sach("01", "SachAnh", "Kiet", 2011, 10.000);
        Sach sach2 = new Sach("02", "SachVan", "Kiet", 1980, 20.000);
        Sach sach3 = new Sach("03", "SachToan", "Kiet", 1970, 30.000);
//        sach1.hienThiThongTin();
//        sach2.hienThiThongTin();
//        sach3.hienThiThongTin();
        List<Sach> list = new ArrayList<>();
        list.add(sach1);
        list.add(sach2);
        list.add(sach3);
        for(int i = 0; i<list.size();i++) {
            if (list.get(i).laSachCu()) {
                list.get(i).hienThiThongTin();
            }
        }
    }
}