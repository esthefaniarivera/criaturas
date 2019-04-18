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
public class Criatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usarDescripcion(new Valquiria());
        usarArma(new Valquiria());
        usarArmadura(new Valquiria());
    }
    
    public static void usarArma(CriaturaAbstracta arma){
        ArmaAbstracta a = arma.crearArma();
        a.descripcion();
        a.nombre();
        a.tamaño();
    }
    
    public static void usarArmadura(CriaturaAbstracta armadura){
        ArmaduraAbstracta a = armadura.crearArmaura();
        a.descripccion();
        a.material();
    }
     
    public static void usarDescripcion(CriaturaAbstracta descripcion){
        DescripcionAbstracta a = descripcion.crearDescripcion();
        a.descripcion();
    }
    
}
