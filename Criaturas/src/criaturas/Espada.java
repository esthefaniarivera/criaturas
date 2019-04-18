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
public class Espada implements ArmaAbstracta{

     @Override
    public void nombre() {
        System.out.println("Espada:");
    }
    @Override
    public void descripcion() {
        System.out.println("La espada es un arma blanca de dos filos que consiste"
                          + " básicamente en una hoja recta cortante, punzante "
                          + "—o con ambas características—, con empuñadura, y "
                          + "de cierta envergadura o marca");
    }

    @Override
    public void tamaño() {
        System.out.println("Espada Larga: 90cm a 120cm, Espada Corta:40cm a 60cm");
    }
    
}
