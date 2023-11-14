package model;

public class Lichchieu003 {
    private int id;
    private Phim003 phim;
    private Khunggiochieu003 khunggio;
    private Phongchieu003 phong;
    private Nhanvienquanly003 nhanvienquanly;

    public Lichchieu003() {
        super();
    }

    public Lichchieu003(int id, Phim003 phim, Khunggiochieu003 khunggio, Phongchieu003 phong, Nhanvienquanly003 nhanvienquanly) {
        super();
        this.id = id;
        this.phim = phim;
        this.khunggio = khunggio;
        this.phong = phong;
        this.nhanvienquanly = nhanvienquanly;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Phim003 getPhim() {
        return phim;
    }

    public void setPhim(Phim003 phim) {
        this.phim = phim;
    }

    public Khunggiochieu003 getKhunggio() {
        return khunggio;
    }

    public void setKhunggio(Khunggiochieu003 khunggio) {
        this.khunggio = khunggio;
    }

    public Phongchieu003 getPhong() {
        return phong;
    }

    public void setPhong(Phongchieu003 phong) {
        this.phong = phong;
    }

    public Nhanvienquanly003 getNhanvienquanly() {
        return nhanvienquanly;
    }

    public void setNhanvienquanly(Nhanvienquanly003 nhanvienquanly) {
        this.nhanvienquanly = nhanvienquanly;
    }
}
