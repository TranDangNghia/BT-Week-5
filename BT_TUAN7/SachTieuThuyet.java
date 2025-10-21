public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Là sách series: " + (laSachSeries ? "Có" : "Không"));
        System.out.println("Giá cơ bản: " + giaCoBan + " VNĐ");
        System.out.println("Giá bán: " + tinhGiaBan() + " VNĐ");
        System.out.println("----------------------");
    }

    @Override
    public String toString() {
        return super.toString()
                + "Thể loại: " + theLoai + "\n"
                + "Là sách series: " + (laSachSeries ? "Có" : "Không") + "\n"
                + "Giá cơ bản: " + giaCoBan + " VNĐ\n"
                + "Giá bán: " + tinhGiaBan() + " VNĐ\n";
    }
}
