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
public class GarraFuego implements ArmaAbstracta{

    @Override
    public void nombre() {
        System.out.println("Garras y Fuego");
    }

    @Override
    public void descripcion() {
        System.out.println("Garras: Son las manos o pies provistos de uñas largas "
                + "y afiladas; Fuego: Fluido volatil imposible de apagar, puede arder "
                + "sobre el agua");
    }

    @Override
    public void tamaño() {
        System.out.println("Garras: Un dragon adulto llega a tener garras de "
                + "aproximadamente 40cm; Fuego: Rango de 7m a 8m");
    }
    
    
}
