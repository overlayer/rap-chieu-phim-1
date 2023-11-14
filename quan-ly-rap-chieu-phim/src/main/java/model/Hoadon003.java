package model;

public class Hoadon003 {
    private int id;
    private float tongtien;
    private int sove;
    private String hinhthuc;
    private String ngaythanhtoan;
    private Khachhang003 khachhang;
    private Nhanvienbanhang003 nhanvienbanhang;

    public Hoadon003() {
        super();
    }

    public Hoadon003(int id, float tongtien, int sove, String hinhthuc, String ngaythanhtoan, Khachhang003 khachhang, Nhanvienbanhang003 nhanvienbanhang) {
        super();
        this.id = id;
        this.tongtien = tongtien;
        this.sove = sove;
        this.hinhthuc = hinhthuc;
        this.ngaythanhtoan = ngaythanhtoan;
        this.khachhang = khachhang;
        this.nhanvienbanhang = nhanvienbanhang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public int getSove() {
        return sove;
    }

    public void setSove(int sove) {
        this.sove = sove;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public String getNgaythanhtoan() {
        return ngaythanhtoan;
    }

    public void setNgaythanhtoan(String ngaythanhtoan) {
        this.ngaythanhtoan = ngaythanhtoan;
    }

    public Khachhang003 getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang003 khachhang) {
        this.khachhang = khachhang;
    }

    public Nhanvienbanhang003 getNhanvienbanhang() {
        return nhanvienbanhang;
    }

    public void setNhanvienbanhang(Nhanvienbanhang003 nhanvienbanhang) {
        this.nhanvienbanhang = nhanvienbanhang;
    }
}
