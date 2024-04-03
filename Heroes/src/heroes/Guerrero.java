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
public class Guerrero extends Heroe{
    Random rm=new Random();
    public Guerrero(String nombre) {
        super(nombre);
        this.inteligencia=rm.nextInt(3,5);
        this.fuerza=rm.nextInt(10,25);
        this.destreza=rm.nextInt(1,10);
        this.vida=rm.nextInt(8,20);
        
    }

    public void furia(){
        if (vida>6) {
            fuerza+=6;
            vida-=6;
            
            System.out.println(nombre+" ha usado furia su  fuerza es "+fuerza+" y su vida es "+vida);
        }
    
    }
    
    
    
    @Override
    public void atacar(Heroe heroe) {
        if (!heroe.esquivar()) {
            heroe.vida=heroe.vida-(fuerza);
            
        }

    }

    public boolean esquivar() {
        int numAleatorio=rm.nextInt(3,30);
        boolean esquiva=false;
        if (numAleatorio<destreza) {
            esquiva=true;
        }
        
        return esquiva;
    
    
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Guerrero";
    }
    
    
}
