package model;

public class Ve003 {
    private int id;
    private String loaive;
    private float giatien;  // Change the data type to float
    private String ghichu;
    private Ghe003 ghe;
    private Lichchieu003 lichchieu;

    public Ve003() {
        super();
    }

    public Ve003(int id, String loaive, float giatien, String ghichu, Ghe003 ghe, Lichchieu003 lichchieu) {
        super();
        this.id = id;
        this.loaive = loaive;
        this.giatien = giatien;
        this.ghichu = ghichu;
        this.ghe = ghe;
        this.lichchieu = lichchieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaive() {
        return loaive;
    }

    public void setLoaive(String loaive) {
        this.loaive = loaive;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Ghe003 getGhe() {
        return ghe;
    }

    public void setGhe(Ghe003 ghe) {
        this.ghe = ghe;
    }

    public Lichchieu003 getLichchieu() {
        return lichchieu;
    }

    public void setLichchieu(Lichchieu003 lichchieu) {
        this.lichchieu = lichchieu;
    }
}
