public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap do: " + capDo);
        System.out.println("------------------------------");
    }

    @Override
    public String toString() {
        return "Sach giao trinh - " + getTieuDe() + " (" + getTacGia() + "), Mon: " + monHoc + ", Cap: " + capDo;
    }
}
