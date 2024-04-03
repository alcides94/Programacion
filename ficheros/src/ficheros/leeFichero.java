/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alides
 */
public class leeFichero {
    
    public void lee (){
        
        try {
            //
            FileReader lectura= new FileReader("C:/Users/Alides/Desktop/java.txt");
            int c=lectura.read();
            while (c!=-1) {                
                
                char letra=(char)c;
                System.out.print(letra);
                c=lectura.read();
            }
            lectura.close();
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }
        
    }
}
