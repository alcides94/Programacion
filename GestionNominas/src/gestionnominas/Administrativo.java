/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public class Administrativo extends Gestion{

    public Administrativo(int antiguedad, String dni, String nombre, double salarioB) {
        super(antiguedad, dni, nombre, salarioB);
    }

    @Override
    public double calcularSalarioF() {
        double salarioF=salarioB+(antiguedad*20);
        return salarioF;
    }
    
    
    @Override
    public String toString() {
        return "Administrativo: {dni=" + dni + ", nombre=" + nombre + ", salarioB=" + salarioB + ", salarioF="
                + calcularSalarioF()+ "}";
    }
    
    
}
