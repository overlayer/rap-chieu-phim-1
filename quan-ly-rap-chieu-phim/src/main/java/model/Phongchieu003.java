package model;

import java.util.List;

public class Phongchieu003 {
    private int id;
    private String tenphong;
    private int succhua;
    private List<Ghe003> listGhe;

    public Phongchieu003() {
        super();
    }

    public Phongchieu003(int id, String tenphong, int succhua, List<Ghe003> listGhe) {
        super();
        this.id = id;
        this.tenphong = tenphong;
        this.succhua = succhua;
        this.listGhe = listGhe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getSucchua() {
        return succhua;
    }

    public void setSucchua(int succhua) {
        this.succhua = succhua;
    }

    public List<Ghe003> getListGhe() {
        return listGhe;
    }

    public void setListGhe(List<Ghe003> listGhe) {
        this.listGhe = listGhe;
    }
}
