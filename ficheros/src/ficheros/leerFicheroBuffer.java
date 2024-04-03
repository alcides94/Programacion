/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alides
 */
public class leerFicheroBuffer {
    
    public void leeBuffer(){
        try {
            FileReader direccion =new FileReader("C:/Users/Alides/Desktop/java.txt");
            
            BufferedReader miArchivoBuff = new BufferedReader(direccion);
            
            String linea="";
            
            while (linea!=null) {
                linea=miArchivoBuff.readLine();
                
                if (linea!=null) System.out.println(linea);
                
            }
            miArchivoBuff.close();
            
        } catch (IOException e) {
            System.out.println("Error de archivo");
        }
        
        
    }
    
}
