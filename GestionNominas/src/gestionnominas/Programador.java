/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public class Programador extends Informatico{

    public Programador(String titulacion, String dni, String nombre, double salarioB) {
        super(titulacion, dni, nombre, salarioB);
    }

    @Override
    public double calcularSalarioF() {
        double salarioF=salarioB+(salarioB*0.15);
        return salarioF;
    
    }
    
    @Override
    public String toString() {
        return "Programador: {dni=" + dni + ", nombre=" + nombre + ", salarioB=" + salarioB + ", salarioF="
                + calcularSalarioF()+ "}";
    }    
    
}
