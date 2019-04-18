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
public class ArmaduraHierro implements ArmaduraAbstracta{

    @Override
    public void descripccion() {
        System.out.println("Peto y yelmo que cubren su parte humana la cual es la mas vulnerable."
                + "Está hecha de hierro negro especial y te protege de los ataques de fuego. Pesa mucho.");
    }

    @Override
    public void material() {
        System.out.println("Hierro: resistencia al desgaste, dureza y resistencia"
                + " a determinadas temperaturas");
    }
    
}
