public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet() {}
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Là sách series: " + (laSachSeries ? "Có" : "Không"));
        System.out.println("----------------------");
    }
}
