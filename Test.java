public class Test {
    public static void main(String[] args) {
        // Constructor đầy đủ
        Sach sach1 = new Sach("B001", "Java Cơ Bản", "Nguyễn Văn A", 2023, 10);

        // Constructor mặc định + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);

        // Constructor rút gọn
        Sach sach3 = new Sach("Trí tuệ nhân tạo", "Lê Văn C", 2022);
        sach3.setMaSach("B003");
        sach3.setSoLuong(7);

        // In ra cho dễ đọc
        sach1.hienThiThongTin();
        
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}
