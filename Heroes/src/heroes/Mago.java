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
public class Mago extends Heroe{
    Random rm=new Random ();
    int vidaMax;
    public Mago(String nombre) {
        super(nombre);
        this.inteligencia=rm.nextInt(10,21);
        this.fuerza=rm.nextInt(3,8);
        this.destreza=rm.nextInt(5,12);
        this.vida=rm.nextInt(2,10);
        this.vidaMax=vida;
    }
    
    public void curarse (){
        if (vida+3>vidaMax) {
            vida=vidaMax;
            System.out.println(nombre+"Se ha curado a su vida maxima");
        }else{
            vida+=3;
            
            System.out.println(nombre+"Se ha curado 3 puntos");
        }
    }

    @Override
    public void atacar(Heroe heroe) {
        if (!heroe.esquivar()) {
            heroe.vida=heroe.vida-(fuerza/2);
        }

    }

    public boolean esquivar() {
        int numAleatorio=rm.nextInt(2,40);
        boolean esquiva=false;
        if (numAleatorio<destreza) {
            esquiva=true;
        }
        return esquiva;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Mago";
    }
    
    
    
    
    
    
    
    
    
}
