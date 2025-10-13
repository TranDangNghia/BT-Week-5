import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qlSach = new QuanLySach();

        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2023, 10);
        Sach sach2 = new Sach("B002", "Cấu trúc dữ liệu", "Trần Thị B", 2021, 5);
        SachGiaoTrinh giaoTrinh1 = new SachGiaoTrinh("GT001", "Toán Đại học", "Nguyễn Văn C", 2020, 8, "Toán", "Đại học");
        SachTieuThuyet tieuThuyet1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 12, "Fantasy", true);

        qlSach.themSach(sach1);
        qlSach.themSach(sach2);
        qlSach.themSach(giaoTrinh1);
        qlSach.themSach(tieuThuyet1);

        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Hiển thị danh sách sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Cập nhật sách");
            System.out.println("4. Tìm kiếm sách theo tiêu đề");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qlSach.hienThiDanhSach();
                    break;
                case 2:
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhập số lượng: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine(); 
                    Sach sachMoi = new Sach(ma, tieuDe, tacGia, nam, soLuong);
                    qlSach.themSach(sachMoi);
                    break;
                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String maCapNhat = sc.nextLine();
                    System.out.print("Nhập tiêu đề mới: ");
                    String tieuDeMoi = sc.nextLine();
                    System.out.print("Nhập tác giả mới: ");
                    String tacGiaMoi = sc.nextLine();
                    System.out.print("Nhập số lượng mới: ");
                    int soLuongMoi = sc.nextInt();
                    sc.nextLine();
                    qlSach.capNhatSach(maCapNhat, tieuDeMoi, tacGiaMoi, soLuongMoi);
                    break;
                case 4:
                    System.out.print("Nhập tiêu đề sách cần tìm: ");
                    String tieuDeTim = sc.nextLine();
                    qlSach.timKiemTheoTieuDe(tieuDeTim);
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    qlSach.xoaSach(maXoa);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        sc.close();
    }
}
