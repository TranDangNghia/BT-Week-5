import java.util.ArrayList;

class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        if (sach != null) {
            danhSachSach.add(sach);
            System.out.println("Đã thêm sách: " + sach.getTieuDe());
        } else {
            System.out.println("Sách không hợp lệ.");
        }
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Sach sach : danhSachSach) {
            sach.hienThiThongTin();
            System.out.println("---------------------------");
        }
    }

    public Sach timKiemTheoTieuDe(String tieuDe) {
        for (Sach sach : danhSachSach) {
            if (sach.getTieuDe().equalsIgnoreCase(tieuDe)) {
                System.out.println("Đã tìm thấy sách với tiêu đề: " + tieuDe);
                sach.hienThiThongTin();
                return sach;
            }
        }
        System.out.println("Không tìm thấy sách với tiêu đề: " + tieuDe);
        return null;
    }

    public void xoaSach(String maSach) {
        if (maSach == null || maSach.isEmpty()) {
            System.out.println(" Mã sách không hợp lệ.");
            return;
        }

        Sach sachCanXoa = null;
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                sachCanXoa = sach;
                break;
            }
        }

        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Đã xóa sách với mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách với mã: " + maSach);
        }
    }
    public void capNhatSach(String maSach, String tieuDe, String tacGia, int soLuongMoi, double giaMoi) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setTieuDe(tieuDe);
                s.setTacGia(tacGia);
                s.setSoLuong(soLuongMoi);
                s.setGiaCoBan(giaMoi);
                System.out.println("Đã cập nhật sách với mã: " + maSach);
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + maSach);
    }
}
