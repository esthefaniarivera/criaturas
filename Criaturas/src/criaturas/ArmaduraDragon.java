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
public class ArmaduraDragon implements ArmaduraAbstracta{

    @Override
    public void descripccion() {
        System.out.println("una piel de impenetrables escamas de la dureza del acero. "
                + "Su único punto débil, el vientre, esta protegido casi por completo "
                + "por una capa de piedras preciosas y oro, incrustadas en su piel");
    }

    @Override
    public void material() {
        System.out.println("Escamas y joyas");
    }
    
}
