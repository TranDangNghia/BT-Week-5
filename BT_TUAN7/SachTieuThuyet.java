public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia, int namXuatBan, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tenSach, tacGia, namXuatBan, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Thể loại: " + theLoai +
               ", Là sách series: " + (laSachSeries ? "Có" : "Không") +
               ", Giá bán: " + tinhGiaBan();
    }
}
