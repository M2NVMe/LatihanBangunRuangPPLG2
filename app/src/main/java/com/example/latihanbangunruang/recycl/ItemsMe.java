package com.example.latihanbangunruang.recycl;

public class ItemsMe {

    String nama;
    String img;

    public ItemsMe(String name, String imeg) {
        nama = name;
        img = imeg;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
