/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author saiee
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       PyramidCSVDAO pDAO = new PyramidCSVDAO();
    List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\Users\\saiee\\JavaApplication1\\src\\javaapplication1\\pyramids.csv");
   System.out.println("  Pharaoh"+" "+"Modern_name"+" "+"Site"+" "+"Height");
   int x=0;
    for (Pyramid i : pyramids){
        System.out.println((++x)+" "+i.getPharaoh()+" "+i.getModern_name()+" "+i.getSite()+" "+i.getHeight());
    }
    }
    
}
