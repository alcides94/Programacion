
package contadorPalabras;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * Contador de Palabras:
• Leer un archivo de texto y contar el número total de palabras en él.
* • Mostrar el resultado por pantalla
 * @author Alides
 */
public class contadorPalabras {

    public static void main(String[] args) {
        // TODO code application logic here
        // esta app es mas precisa que el split
        try {
            FileReader archivo =new FileReader("java.txt");
            BufferedReader miArchivo =new BufferedReader(archivo);
            String linea = miArchivo.readLine();
            int contador=0 ;
            while (linea!=null) {                
                for (int i = 0; i < linea.length(); i++) {
                    if (i==0){
                        if (linea.charAt(i)!=' ') {
                            contador++;
                        }
                    }else{
                        if (linea.charAt(i-1)==' ') {
                            if (linea.charAt(i)!=' ') {
                                contador++;
                            }
                        }
                    }
                }
                linea =miArchivo.readLine();
            }
            miArchivo.close();
            System.out.println("cantidad de palabras: "+contador);
        } catch (Exception e) {
        }
        

    }
    
}
