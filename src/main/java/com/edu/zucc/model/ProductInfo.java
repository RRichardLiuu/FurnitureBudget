package com.edu.zucc.model;

public class ProductInfo extends Productbudget {
    private String userName;
    private String furnitureName;
    private float price;

    public ProductInfo() {
    }

    public ProductInfo(Productbudget productbudget,String userName, String furnitureName,Float price) {
        super.setId(productbudget.getId());
        super.setFurnitures(productbudget.getFurnitures());
        super.setUser(productbudget.getUser());
        this.userName = userName;
        this.furnitureName = furnitureName;
        this.price=price;
    }

    public ProductInfo(Productbudget productbudget,String userName, String furnitureName) {
        super.setId(productbudget.getId());
        super.setFurnitures(productbudget.getFurnitures());
        super.setUser(productbudget.getUser());
        this.userName = userName;
        this.furnitureName = furnitureName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
