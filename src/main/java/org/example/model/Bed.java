package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style , int pillows , int height , int sheets , int quilt){
        this.style = style;
        this.sheets = sheets;
        this.pillows = pillows;
        this.height = height;
        this.quilts = quilts;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }
}
