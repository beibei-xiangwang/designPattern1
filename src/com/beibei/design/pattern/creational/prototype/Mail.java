package com.beibei.design.pattern.creational.prototype;

public class Mail implements Cloneable{
    private String Name;
    private String Address;
    private String Content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Content='" + Content + '\'' +
                '}'+super.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
