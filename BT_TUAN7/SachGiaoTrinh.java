public class SachGiaoTrinh extends Sach {
    protected String monHoc;
    protected String capDo;

    public SachGiaoTrinh() {}

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,   int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Môn học: " + monHoc);
        System.out.println("Cấp độ: " + capDo);
        System.out.println("Giá cơ bản: " + giaCoBan + " VNĐ");
        System.out.println("Giá bán: " + tinhGiaBan() + " VNĐ");
        System.out.println("----------------------");
    }

    @Override
    public String toString() {
        return super.toString()
                + "Môn học: " + monHoc + "\n"
                + "Cấp độ: " + capDo + "\n"
                + "Giá cơ bản: " + giaCoBan + " VNĐ\n"
                + "Giá bán: " + tinhGiaBan() + " VNĐ\n";
    }
}
