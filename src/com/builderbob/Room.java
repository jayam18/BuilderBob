package com.builderbob;

/**
 * Created by localadmin on 7/27/16.
 */
public class Room {
    private String name;
    private Floor f;
    private float floorPrice;
    private Paint p;
    private float paintPrice;
    private int length;
    private int width;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Floor getF() {
        return f;
    }

    public void setF(Floor f) {
        this.f = f;
    }

    public float getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(float floorPrice) {
        this.floorPrice = floorPrice;
    }

    public Paint getP() {
        return p;
    }

    public void setP(Paint p) {
        this.p = p;
    }

    public float getPaintPrice() {
        return paintPrice;
    }

    public void setPaintPrice(float paintPrice) {
        this.paintPrice = paintPrice;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Room(String name, Floor f, float floorPrice, Paint p, float paintPrice, int length, int width, int height) {
        this.name = name;
        this.f = f;
        this.floorPrice = floorPrice;
        this.p = p;
        this.paintPrice = paintPrice;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float floorcost(){
        float roomfloorcost = 0;
        roomfloorcost = this.length * this.width * this.floorPrice;
        return roomfloorcost;
    }

    public float paintcost(){
        float roompaintcost = 0;
        roompaintcost = this.paintPrice * (this.height * this.width * 2) + (this.height * this.length * 2) + (this.length * this.width);
        return roompaintcost;
    }

}
