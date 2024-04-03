
package creadorArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alides
 */
public class creadorArchivos {

    /**
     *Creador de Archivos:
                    • Crear un programa que genere un archivo de texto con contenido
            personalizado.
                    • Permitir al usuario especificar el nombre del archivo y el contenido
            que desea escribir en él
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner (System.in);
        String ruta= JOptionPane.showInputDialog("Introduce el nombre del archivo a crear y su extencion: ");
        String frase= JOptionPane.showInputDialog("Ingrese la Frase");
        
        File original= new File(ruta);
        
        try {
            BufferedWriter archivo =new BufferedWriter(new FileWriter(original));
            
            archivo.write(frase);
            archivo.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
