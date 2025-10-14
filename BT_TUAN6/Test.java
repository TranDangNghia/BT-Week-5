public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van A", 2020, 10, "Toan", "Dai hoc");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Vat ly dai cuong", "Tran Van B", 2021, 5, "VVat ly", "Dai hoc");

        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 1997, 7, "Phieu luu", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "Tuoi tho du doi", "Phung Quan", 1988, 3, "Chien tranh", false);

        ql.themSach(gt1);
        ql.themSach(gt2);
        ql.themSach(tt1);
        ql.themSach(tt2);

        System.out.println("=== Danh sach ban đau ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== Tim kiem ma 'TT01' ===");
        Sach tim = ql.timKiemSach("TT01");
        if (tim != null) tim.hienThiThongTin();

        System.out.println("\n=== Cap nhat sach 'GT02' ===");
        SachGiaoTrinh gt2moi = new SachGiaoTrinh("GT02", "Vat ly co ban", "Tran Van B", 2022, 8, "VVat ly", "Dai hoc");
        ql.capNhatSach("GT02", gt2moi);
        ql.hienThiDanhSach();

        System.out.println("\n=== Xoa sach 'TT02' ===");
        ql.xoaSach("TT02");
        ql.hienThiDanhSach();
    }
}
