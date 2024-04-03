
package buscadorPalabras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * 
 * Buscador de Palabras:
• Leer un archivo de texto y buscar una palabra específica.
• Mostrar la línea y la posición de cada ocurrencia de la palabra
buscada.
 * @author Alides
 */
public class buscadorPalabras {

    public static void main(String[] args) {
        // TODO code application logic here
        
        File original =new File ("java.txt");
        Scanner sc= new Scanner(System.in);
        try {
            FileReader archivo = new FileReader(original);
            BufferedReader miArchivo =new BufferedReader(archivo);
            
            System.out.print("Ingrese la palabra a buscar: ");
            String auxLinea=sc.next();
            String linea=miArchivo.readLine();
         
            int contLinea=0, posicion=0;
            while (linea!=null) {                
                contLinea++;
                if (linea.contains(auxLinea)) {
                    posicion=linea.indexOf(auxLinea);
                }
                
                linea=miArchivo.readLine();
     
            }
            miArchivo.close();
            System.out.println("La palabra se encuentra en la linea: "+contLinea+" y en la posiscion: "+posicion);
            
        } catch (IOException e) {
        }
        
        
    }
    
}
