/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author ESTEFA
 */
public class Centauro implements FabricaAbstracta{
    private Arco arma;

    @Override
    public void crearArma() {
        arma = new Arco();
    }

    @Override
    public ArmaAbstracta getArma() {
        return arma;
    }

    public Centauro() {
        this.crearArma();
    }
    
    
    
}
