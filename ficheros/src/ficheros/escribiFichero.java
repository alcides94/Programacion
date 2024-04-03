/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alides
 */
public class escribiFichero {
    public void escribi(){
        
        String frase=("Agregamos esto practicando");
        try {
            
            //este codigo crea un objeto del archvo crea el archivo o sobreeescribe si es que esta creado
            FileWriter escritura =new FileWriter("C:/Users/Alides/Desktop/java.txt");
            
            //en caso de no querrer borrar el creado se procede a poner true al final
   //       FileWriter escritura =new FileWriter("C:/Users/Alides/Desktop/java.txt", true);
            
            /*
            Este bucle for recorre cada carácter de la cadena frase
            y lo escribe en el archivo utilizando el método write() del objeto FileWriter
            */
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
                
            }
            escritura.close();
        } catch (IOException e) {
            System.out.println("Problemas con el fichero");
        }
        
        
    }
}
