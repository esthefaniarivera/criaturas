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
public class ArmaduraCuero implements ArmaduraAbstracta{

    @Override
    public void descripccion() {
        System.out.println("Las diferentes placas de piel (que suelen ser de 3 a 4 "
                + "mm de grosor), se cosen a mano con hilo encerado o más habitualmente,"
                + " se remachan con remaches metálicos. Estas armaduras pueden ser "
                + "de muchas formas, debido a la flexibilidad del cuero.");
    }

    @Override
    public void material() {
        System.out.println("Pieles: La piel es un material flexible y cálido, de origen "
                + "animal, obtenido con el curtido de la piel.");
    }
    
}
