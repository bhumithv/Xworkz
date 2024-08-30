package com.xworkz.testapp.polyencap;

public class AsianPaint {
    private int paintId;
    private String paintColor;
    private String paintType;
    private double price;
    private String paintQuantity;

    public void AsianPaint(){

    }
    @Override
    public String toString(){
        return "AsianPaint-(Paint Id:"+ this.paintId+",Paint Color:"+ this.paintColor+",Paint Type:"+ this.paintType+",Paint price:"+ this.paintQuantity+";)";
    }

    public void setPaintId(int paintId) {
        this.paintId = paintId;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPaintQuantity(String paintQuantity) {
        this.paintQuantity = paintQuantity;
    }

    public int getPaintId() {
        return paintId;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public String getPaintType() {
        return paintType;
    }

    public double getPrice() {
        return price;
    }

    public String getPaintQuantity() {
        return paintQuantity;
    }
}
