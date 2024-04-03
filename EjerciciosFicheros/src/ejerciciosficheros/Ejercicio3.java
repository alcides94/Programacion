
package ejerciciosficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alides
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner (System.in);
        String ruta1,ruta2,ruta3;
        
        ruta1=JOptionPane.showInputDialog("Ingresa la ruta del primer Archivo, sin Formato");
        ruta2=JOptionPane.showInputDialog("Ingresa la ruta del segundo Archivo, sin Formato");
        ruta3=JOptionPane.showInputDialog("Ingresa la ruta del tercer Archivo sin nombre del Archivo");
        boolean salir=true;
        File original1=new File(ruta1+".txt");
        File original2=new File(ruta2+".txt");
        File original3=new File(ruta3+ruta1+"_"+ruta2+".txt");
        
        try {
            FileReader archivo1=new FileReader(original1);
            BufferedReader miArchivo1=new BufferedReader(archivo1);
            
            FileReader archivo2=new FileReader(original2);
            BufferedReader miArchivo2=new BufferedReader(archivo2);
            
            if (!original3.exists()) {
                original3.createNewFile();
            }
            
            FileWriter archivo3 = new FileWriter(original3.getAbsoluteFile(),true);
            BufferedWriter miArchivo3 = new BufferedWriter(archivo3);
            
            
            String linea=miArchivo1.readLine();
            String lineaAuxiliar;
            while (linea!=null) {                
                lineaAuxiliar=linea;
                miArchivo3.write(lineaAuxiliar);
                miArchivo3.newLine();
                linea=miArchivo1.readLine();
            }
            linea=miArchivo2.readLine();
            while (linea!=null) {                
                lineaAuxiliar=linea;
                miArchivo3.write(lineaAuxiliar);
                miArchivo3.newLine();
                linea=miArchivo2.readLine();
            }
            miArchivo1.close();
            miArchivo2.close();
            miArchivo3.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
