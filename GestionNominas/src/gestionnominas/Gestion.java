/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public abstract class Gestion extends Trabajador{
    protected int antiguedad;

    public Gestion(int antiguedad, String dni, String nombre, double salarioB) {
        super(dni, nombre, salarioB);
        this.antiguedad = antiguedad;
    }

    
    
}
