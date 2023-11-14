package model;

public class Khunggiochieu003 {
    private int id;
    private String giobatdau;
    private String ghichu;

    public Khunggiochieu003() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Khunggiochieu003(int id, String giobatdau, String ghichu) {
        super();
        this.id = id;
        this.giobatdau = giobatdau;
        this.ghichu = ghichu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGiobatdau() {
        return giobatdau;
    }

    public void setGiobatdau(String giobatdau) {
        this.giobatdau = giobatdau;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
}
