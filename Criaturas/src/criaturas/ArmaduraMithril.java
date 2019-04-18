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
public class ArmaduraMithril implements ArmaduraAbstracta{

    @Override
    public void descripccion() {
        System.out.println("Se trataba de una cota de malla de mangas largas, armada "
                + "y entrelazada con pequeños anillos de mithril, que la hacían muy "
                + "flexible, liviana pero muy dura y resistente. Distintos tipos "
                + "de gemas la tachonaban en casi toda su superficie.");
    }

    @Override
    public void material() {
        System.out.println("Mithril: Se dice que es el más duro de los metales y "
                + "que tiene diversas propiedades. Aparentemente, tiene el aspecto"
                + " de la plata, pero no se oxida ni ennegrece jamás, como el platino;"
                + " siendo considerado mucho más valioso que el oro. Sin embargo "
                + "poseería una mayor fortaleza en comparación a la plata y el platino.");
    }
    
}
