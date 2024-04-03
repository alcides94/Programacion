/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroes;

/**
 *
 * @author Alides
 */
public class Heroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mago mago=new Mago("Alcides");
        Guerrero guerrero=new Guerrero("Quinteros");
        Elfo elfo = new Elfo("Ugarte");
        
        System.out.println("Info inicial");
        
        System.out.println(mago);
        System.out.println(guerrero);
        System.out.println(elfo);
        
        mago.curarse();
        guerrero.furia();
        elfo.rapidez();
        
        System.out.println("\nInformación después de las acciones:");
        System.out.println(mago);
        System.out.println(guerrero);
        System.out.println(elfo);
        
        
        System.out.println("\nSimulación de ataques:");
        mago.atacar(guerrero);
        guerrero.atacar(elfo);
        elfo.atacar(mago);
        
        
        // Mostrar información final después de los ataques
        System.out.println("\nInformación final después de los ataques:");
        System.out.println(mago);
        System.out.println(guerrero);
        System.out.println(elfo);
        
        
    }
    
}


