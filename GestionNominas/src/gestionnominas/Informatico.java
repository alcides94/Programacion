/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public abstract class Informatico extends Trabajador{
    protected String titulacion;

    public Informatico(String titulacion, String dni, String nombre, double salarioB) {
        super(dni, nombre, salarioB);
        this.titulacion = titulacion;
    }
    
    
    
    
    
    
}
