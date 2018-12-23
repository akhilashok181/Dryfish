package com.example.akhil.dryfish.home;
import android.widget.ImageView;

/**
 * Created by Vish on 11/27/2017.
 */

public class Inventory {


    private int fimage;
    private String fname;
    private String fplace;
    private String fprice;
    public Inventory(int fimage,String fname,String fplace,String fprice){
        this.fimage=fimage;
        this.fname=fname;
        this.fplace=fplace;
        this.fprice=fprice;
    }

    public Inventory(String kozhuva, String north_paravur, String s) {
    }

    public int getFimage() {
        return fimage;
    }

    public void setFimage(int fimage) {
        this.fimage = fimage;
    }
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFplace() {
        return fplace;
    }

    public void setFplace(String fplace) { this.fplace = fplace; }

    public String getFprice() {
        return fprice;
    }

    public void setFprice(String fprice) {
        this.fprice = fprice;
    }

    // public String Cost;



}
