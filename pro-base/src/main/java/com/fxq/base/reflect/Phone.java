package com.fxq.base.reflect;

import java.util.Date;

public class Phone {

    private String brand;

    private Double price;

    private String color;

    private Date productionDate;

    public Phone(){

    }

    public Phone(String brand, Double price, String color, Date productionDate) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.productionDate = productionDate;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public void show(){
        System.out.println("品牌："+this.brand+"-"+"颜色："+this.color+"价格："+this.price+"生产日期："+this.productionDate);
    }

    public void playGame(String name){
        System.out.println("使用"+this.brand+"手机玩"+name);
    }

    private String getPhoneInfo(){
        return "信息:"+this.brand+this.color+this.price+this.productionDate;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
