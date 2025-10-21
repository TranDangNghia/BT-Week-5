public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách giáo trình
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giải Tích 1", "Nguyễn Hữu Tú", 2020, 50000, "Toán học", "Đại học");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Hóa học cơ bản", "Ngô Thanh Nguyên", 2018, 60000, "Hóa học", "Phổ thông");

        // Thêm tiểu thuyết
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 2023, 45000, "Phiêu lưu", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Ngôi nhà nhỏ trên thảo nguyên", "Laura Wilder", 2020, 70000, "Gia đình", false);

        // Thêm vào danh sách
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("===== DANH SÁCH SAU KHI THÊM =====");
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println("\n===== TÌM KIẾM SÁCH MÃ 'TT01' =====");
        System.out.println(ql.timKiemTheoMa("TT01"));

        // Cập nhật
        System.out.println("\n===== CẬP NHẬT SÁCH 'GT02' =====");
        SachGiaoTrinh sgMoi = new SachGiaoTrinh("GT02", "Hóa học nâng cao", "Trần Văn B", 2022, 80000, "Hóa học", "Đại học");
        ql.capNhatSach("GT02", sgMoi);
        ql.hienThiDanhSach();

        // Xóa
        System.out.println("\n===== XÓA SÁCH 'TT02' =====");
        ql.xoaSach("TT02");
        ql.hienThiDanhSach();
    }
}
