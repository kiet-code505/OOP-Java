package quanly.hinhhoc;

public class TestHinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat hinhchunhat1 = new HinhChuNhat();
        HinhChuNhat hinhchunhat2 = new HinhChuNhat(6);
        HinhChuNhat hinhchunhat3 = new HinhChuNhat(5,7);

        int ketqua = hinhchunhat1.soSanh(hinhchunhat3);
            if (ketqua>0) {
                System.out.println("Hinh 2 cos dien tich lon hon hinh 3");
            } else if (ketqua<0) {
                System.out.println("Hinh 2 cos dien tich nho hon hinh 3");
            } else {
                System.out.println("Hai hinh co dien tich bang nhau");
            }
        }
    }

