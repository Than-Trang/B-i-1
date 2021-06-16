package com.example.bai1_fix;

public class ThoiTiet {
    private String thu;
    private String nhietDo;
    private int Image;

    public ThoiTiet(String thu, String nhietDo, int image) {
        this.thu = thu;
        this.nhietDo = nhietDo;
        Image = image;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(String nhietDo) {
        this.nhietDo = nhietDo;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
