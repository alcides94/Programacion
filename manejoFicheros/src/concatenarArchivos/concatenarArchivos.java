
package concatenarArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Concatenador de Archivos:
    • Leer varios archivos de texto y combinar su contenido en un solo archivo de salida.
    • Permitir al usuario especificar los nombres de los archivos de entrada y el nombre del archivo de salida.
 * @author Alides
 */
public class concatenarArchivos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        
        String ruta1=JOptionPane.showInputDialog("Ingrese la ruta del archivo 1");
        String ruta2=JOptionPane.showInputDialog("Ingrese la ruta del archivo 2");
        String ruta3=JOptionPane.showInputDialog("Ingrese la ruta del archivo 3 donde estara el contenido");
    
        File origen1=new File (ruta1);
        File origen2=new File(ruta2);
        File origen3 = new File(ruta3);
        
        try {
            FileReader archivo1 = new FileReader(origen1);
            BufferedReader miArchivo1 = new BufferedReader(archivo1);
            
            FileReader archivo2 = new FileReader(origen2);
            BufferedReader miArchivo2 = new BufferedReader(archivo2);
            
            if (!origen3.exists()) {
                origen3.createNewFile();
            }
            
            FileWriter archivo3=new FileWriter(origen3.getAbsoluteFile(),true);
            BufferedWriter miArchivo3 = new BufferedWriter(archivo3);
            
            String linea = miArchivo1.readLine();
            
            while (linea!=null) {                
                miArchivo3.write(linea);
                miArchivo3.newLine();
                linea=miArchivo1.readLine();
            }
            linea = miArchivo2.readLine();
            
            while (linea!=null) {                
                miArchivo3.write(linea);
                miArchivo3.newLine();
                linea=miArchivo2.readLine();
            }
            miArchivo1.close();
            miArchivo2.close();
            miArchivo3.close();
            
            
        } catch (IOException e) {
        }
    
    
    }
    
}
