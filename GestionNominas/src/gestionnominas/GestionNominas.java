/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public class GestionNominas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Empresa empresa=new Empresa ("Wenkai", "C154526",8);
    
        empresa.agregarTrabajador(new Analista("204433963W", "Carles","Ingeniería Informática", 2800 ));
    
        empresa.agregarTrabajador(new Analista("204437956R", "Maria", "Ingeniería Informática", 3000));

        // Añadir dos programadores
        empresa.agregarTrabajador(new Programador("204437963W", "Alba", "Ingeniería Informática", 1100));
        empresa.agregarTrabajador(new Programador("204437964W", "Marti", "Ingeniería Informática", 1200));

        // Añadir dos administrativos
        empresa.agregarTrabajador(new Administrativo(5, "20443300A","Alfonso", 1300));
        empresa.agregarTrabajador(new Administrativo(10, "20443301A", "Pepe", 1400 ));

        // Añadir dos auxiliares
        empresa.agregarTrabajador(new Auxiliar(2,"20443302A", "Jose", 1000 ));
        empresa.agregarTrabajador(new Auxiliar(3,"20443303A", "Ana", 1100));

        // Mostrar listado de trabajadores con sus salarios
        empresa.mostrarTrabajadores();
    
    }
    
}
