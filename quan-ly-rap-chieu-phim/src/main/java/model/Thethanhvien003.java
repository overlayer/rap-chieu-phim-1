package model;

public class Thethanhvien003 {
    private int id;
    private String tenthe;
    private String loaithe;
    private String ngayhethan;
    private String khuyenmai;

    public Thethanhvien003() {
        super();
    }

    public Thethanhvien003(int id, String tenthe, String loaithe, String ngayhethan, String khuyenmai) {
        super();
        this.id = id;
        this.tenthe = tenthe;
        this.loaithe = loaithe;
        this.ngayhethan = ngayhethan;
        this.khuyenmai = khuyenmai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenthe() {
        return tenthe;
    }

    public void setTenthe(String tenthe) {
        this.tenthe = tenthe;
    }

    public String getLoaithe() {
        return loaithe;
    }

    public void setLoaithe(String loaithe) {
        this.loaithe = loaithe;
    }

    public String getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(String ngayhethan) {
        this.ngayhethan = ngayhethan;
    }

    public String getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(String khuyenmai) {
        this.khuyenmai = khuyenmai;
    }
}
