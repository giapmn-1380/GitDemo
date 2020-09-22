package com.dev.hoangit.gitdemo;

public class GiangVien {

    String id, ten, namSinh, monGiangDay;
    int soNamKinhNghiem;
    public GiangVien(String id, String ten, String namSinh, String monGiangDay) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.monGiangDay = monGiangDay;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getMonGiangDay() {
        return monGiangDay;
    }

    public void setMonGiangDayNhe(String monGiangDay) {
        this.monGiangDay = monGiangDay;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", monGiangDay='" + monGiangDay + '\'' +
                '}';
    }
}
