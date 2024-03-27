package com.example.latihanbangunruang.recycl;

public class ItemsMe {

    String nama;
    int img;

    public ItemsMe(String name, int imeg) {
        nama = name;
        img = imeg;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
