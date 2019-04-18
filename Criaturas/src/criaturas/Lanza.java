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
public class Lanza implements ArmaAbstracta{
    
    @Override
    public void nombre() {
        System.out.println("Lanza:");
    }
    @Override
    public void descripcion(){
        System.out.println("La lanza es un arma de asta compuesta por distintos"
                         + "materiales, madera o metal, en una de cuyas extremidades "
                         + "tiene una hoja afilada o puntiaguda de distintos materiales");
    }
     @Override
    public void tamaño(){
        System.out.println("2,5m a 7m");
    }

    
}
