/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author saiee
 */
public final class Pyramid {
   private  double height ;
     private String modern_name , pharaoh , site;
    public Pyramid(String pharaoh ,String modern_name,String site ,double height){
        setHight(height);
        setPharaoh(pharaoh);
        setModern_name(modern_name);
        setSite(site);
    }

    public double getHeight() {
        return height;
    }

    public void setHight(double height) {
        this.height = height;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
}
