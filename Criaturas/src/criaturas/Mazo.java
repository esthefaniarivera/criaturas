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
public class Mazo implements ArmaAbstracta{

    @Override
    public void nombre() {
        System.out.println("Mazo:");
    }
    @Override
    public void descripcion() {
        System.out.println("Un mazo o combo es una herramienta de mano que sirve"
                          + " para golpear o percutir; tiene la forma de un martillo,"
                          + " pero es de mayor tamaño y peso.");
    }

    @Override
    public void tamaño() {
        System.out.println("1,5m a 2m");
    }
    
}
