/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alides
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileReader archivo =new FileReader("java.txt");
            char caracter;
            int assi=archivo.read();
            
            
            while (assi!=-1) {   
                caracter=(char)assi;
                if (caracter!=' ') {
                    System.out.print(caracter);
                }
                assi=archivo.read();
            }
            archivo.close();
            
        } catch (IOException e) {
        
        }
               

    }
    
}
