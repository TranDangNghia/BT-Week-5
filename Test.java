package BT_T5;
public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2023, 10);
        Sach sach2 = new Sach("B002", "Cấu trúc dữ liệu", "Trần Thị B", 2021, 5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        sach2.setSoLuong(7);
        System.out.println("Sau khi cập nhật số lượng:");
        sach2.hienThiThongTin();

    }
}
