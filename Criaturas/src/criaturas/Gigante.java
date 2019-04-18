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
public class Gigante implements CriaturaAbstracta{

    @Override
    public ArmaAbstracta crearArma() {
        return new Mazo();
    }

    @Override
    public ArmaduraAbstracta crearArmaura() {
        return new ArmaduraCuero();
    }

    @Override
    public DescripcionAbstracta crearDescripcion() {
        return new DescripcionGigante();
    }
    
}
