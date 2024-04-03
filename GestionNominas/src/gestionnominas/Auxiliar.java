/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnominas;

/**
 *
 * @author Alides
 */
public class Auxiliar extends Gestion{

    public Auxiliar(int antiguedad, String dni, String nombre, double salarioB) {
        super(antiguedad, dni, nombre, salarioB);
    }

    @Override
    public double calcularSalarioF() {
        
        double salarioF=salarioB+100;
        return salarioF;
    }

   
    @Override
    public String toString() {
        return "Auxiliar: {dni=" + dni + ", nombre=" + nombre + ", salarioB=" + salarioB + ", salarioF="
                + calcularSalarioF()+ "}";
    }
    
}
