package com.example.akhil.dryfish.cart;

/**
 * Created by Vish on 11/27/2017.
 */

public class Inventory {


    private int cfimage;
    private String cfname;
    private String cfplace;
    private String cfprice;
    public Inventory(int fimage, String fname, String fplace, String fprice){
        this.cfimage=fimage;
        this.cfname=fname;
        this.cfplace=fplace;
        this.cfprice=fprice;
    }
    public int getFimage() {
        return cfimage;
    }

    public void setFimage(int fimage) {
        this.cfimage = fimage;
    }
    public String getFname() {
        return cfname;
    }

    public void setFname(String fname) {
        this.cfname = fname;
    }

    public String getFplace() {
        return cfplace;
    }

    public void setFplace(String fplace) { this.cfplace = fplace; }

    public String getFprice() {
        return cfprice;
    }

    public void setFprice(String fprice) {
        this.cfprice = fprice;
    }

    // public String Cost;



}
