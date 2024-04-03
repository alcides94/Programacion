
package ejerciciosficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alides
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese la ruta del archivo:");
        Scanner sc=new Scanner(System.in);
        

        String ruta = JOptionPane.showInputDialog("Ingrese la Ruta del archivo");
       
        System.out.println("Que frase desea agregar en el archivo");
        String frase= JOptionPane.showInputDialog("Ingrese la Frase");
       
        File original = new File(ruta);
        
        try {
            FileWriter archivo =new FileWriter(original);
            String fraseInvertida="";
            for (int i = 0; i < frase.length(); i++) {
                archivo.write(frase.charAt(i));
            }
            archivo.close();
            for (int i = 0; i < frase.length(); i++) {
                
                if (frase.charAt(i)>='a'&&frase.charAt(i)<='z') {
                    fraseInvertida+=Character.toUpperCase(frase.charAt(i));
                }else if (frase.charAt(i)>='A'&&frase.charAt(i)<='Z') {
                    fraseInvertida+=Character.toLowerCase(frase.charAt(i));
                }else if (Character.isDigit(frase.charAt(i))) {
                    fraseInvertida+=frase.charAt(i);
                }else{
                    fraseInvertida+=frase.charAt(i);
                }
            }
            System.out.println(fraseInvertida);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
