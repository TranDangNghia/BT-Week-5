public class Test {
    public static void main(String[] args){
        Sach sach1 = new Sach("S001","De Men Phieu luu ky", "To Hoai", 1941, 50);

        Sach sach2 = new Sach("Doraemon", "Fujiko F.Fujio", 1969);
        sach2.setMaSach("S002");
        sach2.setSoLuong(100);

        System.out.println("=== THÔNG TIN SÁCH ===");
        System.out.println("------------------------------");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
