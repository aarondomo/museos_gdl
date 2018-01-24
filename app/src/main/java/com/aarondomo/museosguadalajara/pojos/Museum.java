package com.aarondomo.museosguadalajara.pojos;


public class Museum {

    private String name;
    private String address;
    private String phone;
    private String hours;
    private String city;
    private int icon;
    private int photo;

    public Museum() {
    }

    public Museum(String name, String address, String phone, String hours, String city) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.hours = hours;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


}
