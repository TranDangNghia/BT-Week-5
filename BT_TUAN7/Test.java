import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qlSach = new QuanLySach();
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Hiển thị danh sách sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Cập nhật sách");
            System.out.println("4. Tìm kiếm theo tiêu đề");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qlSach.hienThiDanhSach();
                    break;
                case 2:
                    System.out.println("Chọn loại sách:");
                    System.out.println("1. Sách giáo trình");
                    System.out.println("2. Sách tiểu thuyết");
                    int loai = sc.nextInt(); sc.nextLine();

                    System.out.print("Nhập mã sách: "); String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: "); String td = sc.nextLine();
                    System.out.print("Nhập tác giả: "); String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: "); int nam = sc.nextInt();
                    System.out.print("Số lượng: "); int sl = sc.nextInt();
                    sc.nextLine();

                    if (loai == 1) {
                        System.out.print("Giá cơ bản (Sách giáo trình): "); double giaGT = sc.nextDouble(); sc.nextLine();
                        System.out.print("Môn học: "); String mon = sc.nextLine();
                        System.out.print("Cấp độ: "); String cap = sc.nextLine();
                        qlSach.themSach(new SachGiaoTrinh(ma, td, tg, nam, sl, giaGT, mon, cap));

                    } else if (loai == 2) {
                        System.out.print("Giá cơ bản (Sách tiểu thuyết): "); double giaTT = sc.nextDouble(); sc.nextLine();
                        System.out.print("Thể loại: "); String tl = sc.nextLine();
                        System.out.print("Là sách series (true/false): "); boolean ser = sc.nextBoolean();
                        qlSach.themSach(new SachTieuThuyet(ma, td, tg, nam, sl, giaTT, tl, ser));
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã cần cập nhật: "); String m = sc.nextLine();
                    System.out.print("Tiêu đề mới: "); String tdM = sc.nextLine();
                    System.out.print("Tác giả mới: "); String tgM = sc.nextLine();
                    System.out.print("Năm mới: "); int namM = sc.nextInt();
                    System.out.print("Giá mới: "); double gM = sc.nextDouble();
                    qlSach.capNhatSach(m, tdM, tgM, namM, gM);
                    break;
                case 4:
                    System.out.print("Nhập tiêu đề cần tìm: ");
                    String tdt = sc.nextLine();
                    qlSach.timKiemTheoTieuDe(tdt);
                    break;
                case 5:
                    System.out.print("Nhập mã cần xóa: ");
                    String mx = sc.nextLine();
                    qlSach.xoaSach(mx);
                    break;
            }
        } while (choice != 0);

        System.out.println("Thoát chương trình.");
        sc.close();
    }
}