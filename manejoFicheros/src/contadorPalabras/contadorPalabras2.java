
package contadorPalabras;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Alides
 */
public class contadorPalabras2 {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileReader archivo =new FileReader("java.txt");
            BufferedReader miArchivo =new BufferedReader(archivo);
            String linea = miArchivo.readLine();
            int contador=0 ;
            while (linea!=null) {                
                contador=contador+(linea.split("\\s").length);
                linea =miArchivo.readLine();
            }
            miArchivo.close();
            System.out.println("cantidad de palabras: "+contador);
        } catch (Exception e) {
        }



    }
    
}
