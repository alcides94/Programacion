/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroes;

/**
 *
 * @author Alides
 */
public abstract class Heroe {
    protected String nombre;
    protected int inteligencia;
    protected int fuerza;
    protected boolean muerto;
    protected int destreza;
    protected int vida;

    public Heroe(String nombre) {
        this.nombre = nombre;
        this.inteligencia = 0;
        this.fuerza = 0;
        this.muerto = false;
        this.destreza = 0;
        this.vida = 0;
    }
    
    public abstract void atacar (Heroe heroe);
    
    public abstract boolean esquivar();

    @Override
    public String toString() {
        return "Heroe{" + "nombre=" + nombre + ", inteligencia=" + inteligencia + ", fuerza=" + fuerza + ", muerto=" + muerto + ", destreza=" + destreza + ", vida=" + vida + '}';
    }
    
    
    
    
    
}
