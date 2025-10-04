public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lap trinh java co ban", "Nguyen Huu Tu", 2024, 10);
        Sach sach2 = new Sach("B002", "Cau truc du lieu & Giai thuat", "Ngo Thanh Nguyen", 2023, 5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        sach2.setSoLuong(7);
        System.out.println("Sau khi cap mhat so luong:");
        sach2.hienThiThongTin();
    }
}

