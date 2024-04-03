/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public abstract class Trabajador {
     String dni;
    protected String nombre;
    protected double salarioB;
    

    public Trabajador(String dni, String nombre, double salarioB) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioB = salarioB;
       
    }
    
    public abstract double calcularSalarioF();

    
}
