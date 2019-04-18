/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criaturas;

/**
 *
 * @author User
 */
public class Dragon implements CriaturaAbstracta{

    @Override
    public ArmaAbstracta crearArma() {
        return new GarraFuego();
    }

    @Override
    public ArmaduraAbstracta crearArmaura() {
        return new ArmaduraDragon();
    }

    @Override
    public DescripcionAbstracta crearDescripcion() {
        return new DescripcionDragon();
    }
    
}
