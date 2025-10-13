public class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected double gia;

    public Sach(String maSach, String tenSach, String tacGia, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach + 
               ", Tên sách: " + tenSach + 
               ", Tác giả: " + tacGia + 
               ", Giá: " + gia;
    }
}

