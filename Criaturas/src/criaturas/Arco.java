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
public class Arco implements ArmaAbstracta{

    @Override
    public void nombre() {
        System.out.println("Arco y Flecha:");
    }
    @Override
    public void descripcion() {
        System.out.println("Un arco es un arma flexible que dispara proyectiles "
                + "aerodinámicos denominados flechas. Una cuerda o lazo se une a "
                + "los dos extremos del arco y cuando la cuerda se estira en varias "
                + "ocasiones, los extremos del arco se flexionan. Cuando se libera "
                + "la cuerda, la energía potencial generada por la flexión del arco "
                + "se transforma en la velocidad de la flecha");
    }

    @Override
    public void tamaño() {
        System.out.println("2m");
    }
    
}
