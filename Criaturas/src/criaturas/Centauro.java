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
public class Centauro implements CriaturaAbstracta{

    @Override
    public ArmaAbstracta crearArma() {
        return new Arco();
    }

    @Override
    public ArmaduraAbstracta crearArmaura() {
        return new ArmaduraHierro();
    }

    @Override
    public DescripcionAbstracta crearDescripcion() {
        return new DescripcionCentauro();
    }
    
}
