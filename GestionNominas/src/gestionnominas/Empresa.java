/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public class Empresa {
    private String cif;
    private String nombre;
    private Trabajador [] trabajadores;
    private int numTrabajadores;

    public Empresa(String cif, String nombre, int maxTrabajadores) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new Trabajador [maxTrabajadores];
        this.numTrabajadores = 0;
    }
    
    public void agregarTrabajador(Trabajador trabajador){
        if (numTrabajadores<trabajadores.length){
            this.trabajadores[numTrabajadores++]=trabajador;
            
        }else{
            System.out.println("NO SE PUEDE AGREGAR MAS TRABAJADORES");
        }
        
    };
    
    
    public void mostrarTrabajadores(){
        for (int i = 0; i < numTrabajadores; i++) {
            Trabajador trabajador =trabajadores[i];
            
            if (trabajador !=null) {
                System.out.println(trabajador);
            }
        
        }
    
    }
    
    
    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }
    
    
    
}
