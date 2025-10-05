import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Sach sach1 = new Sach();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        sach1.setMaSach(scanner.nextLine());
        System.out.print("Nhap tieu de: ");
        sach1.setTieuDe(scanner.nextLine());
        System.out.print("Nhap tac gia: ");
        sach1.setTacGia(scanner.nextLine());
        System.out.print("Nhap nam xuat ban: ");
        sach1.setNamXuatBan(scanner.nextInt());
        System.out.print("Nhap so luong: ");
        sach1.setSoLuong(scanner.nextInt());
        scanner.close();
        System.out.println("=== THÔNG TIN SÁCH ===");
        System.out.println("------------------------------");
        sach1.hienThiThongTin();
    }
}
