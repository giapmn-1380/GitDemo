package com.dev.hoangit.gitdemo;

public class GiangVien {

    String id, ten, namSinh, monGiangDay, soThich;
    int soNamKinhNghiem;
    private int age;

    public GiangVien(String id, String ten, String namSinh, String monGiangDay, int age) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.monGiangDay = monGiangDay;
        this.age = age;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
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

    public void setMonGiangDay(String monGiangDay) {
        this.monGiangDay = monGiangDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
