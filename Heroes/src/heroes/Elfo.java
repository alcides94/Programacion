/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroes;

import java.util.Random;

/**
 *
 * @author Alides
 */
public class Elfo extends Heroe{
    Random rm=new Random();
    public Elfo(String nombre) {
        super(nombre);
        this.inteligencia=rm.nextInt(5,12);
        this.fuerza=rm.nextInt(7, 15);
        this.destreza=rm.nextInt(10,20);
        this.vida=rm.nextInt(5,12);
    }

    public void rapidez(){
        if (fuerza>5) {
            destreza+=4;
            fuerza-=5;
            System.out.println(nombre+" ha usado rapidez ahora su destreza es "+destreza+" y su fuerza "+fuerza);
            
        }
        
    }
    
    
   @Override
    public void atacar(Heroe heroe) {
        if (!heroe.esquivar()) {
            heroe.vida=heroe.vida-(fuerza/3);
        }

    }

    @Override
    public boolean esquivar() {
        int numAleatorio=rm.nextInt(4,50);
        boolean esquiva=false;
        if (numAleatorio<destreza) {
            esquiva=true;
        }
        
        return esquiva;
    
    
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "\nTipo: Elfo";
    }
    
    
    
    
    
}
