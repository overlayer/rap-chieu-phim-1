package model;


public class Thanhvien003 {
    private int id;
    private String hoten;
    private String tentaikhoan;
    private String matkhau;
    private String diachi;
    private String dienthoai;
    private String role;

    public Thanhvien003() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Thanhvien003(int id, String hoten, String tentaikhoan, String matkhau, String diachi, String dienthoai, String role) {
        super();
        this.id = id;
        this.hoten = hoten;
        this.tentaikhoan = tentaikhoan;
        this.matkhau = matkhau;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.role=role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
