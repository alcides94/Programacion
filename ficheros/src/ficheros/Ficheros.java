/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

/**
 *
 * @author Alides
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ACCESO PARA LEER FICHEROS
        
        leeFichero archivo = new leeFichero();
        
        escribiFichero archivo2=new escribiFichero();
        
        leerFicheroBuffer archivo3 = new leerFicheroBuffer();
        
        //archivo.lee();
        //archivo2.escribi();
        archivo3.leeBuffer();
        
    }
    
}
