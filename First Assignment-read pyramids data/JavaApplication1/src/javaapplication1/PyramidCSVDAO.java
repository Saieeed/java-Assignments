/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javaapplication1.Pyramid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saiee
 */
public class PyramidCSVDAO {
   List<Pyramid> pyramidInfo ;
    public List<Pyramid> readPyramidsFromCSV(String  filename) throws IOException{
    this.pyramidInfo = new ArrayList<>();
    File pyramid = new File(filename);
    List <String> lines = new ArrayList<>();
    lines = Files.readAllLines(pyramid.toPath());
    
    for (int i = 1 ; i < lines.size() ; i ++){
        String t = lines.get(i);
        String [] metadata = t.split(",");
        Pyramid y = creatPyramid(metadata);
        pyramidInfo.add(y);
    }
       
        return  pyramidInfo;
    }
    
    public Pyramid creatPyramid (String[] metadata){
        
     double t ;
     if (metadata[7]==""){
         t=0.0;
     }
     else{
         t= Double.valueOf(metadata[7]);
     }
     
     Pyramid x = new Pyramid(metadata[0],metadata[2],metadata[4],t) ; 
     
    return x;
    }
            
            
            
            
            
            
            
            
    
}
