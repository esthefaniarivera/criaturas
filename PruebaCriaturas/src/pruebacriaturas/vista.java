/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacriaturas;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import logica.ArmaAbstracta;
import logica.Centauro;
import logica.FabricaAbstracta;

/**
 *
 * @author ESTEFA
 */
public class vista extends javax.swing.JFrame {

    
    FabricaAbstracta fabrica;
    
    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCentauro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 300));
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        botonCentauro.setText("Centauro");
        botonCentauro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentauroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(botonCentauro)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botonCentauro)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCentauroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentauroActionPerformed

        
         /*JFrame ventana1= new JFrame();
          JLabel centauro = new JLabel();
          JLabel arma= new JLabel();
          ventana1.setSize(300, 200);
          fabrica = new Centauro();
         
          ventana1.getContentPane().add(centauro);
          ventana1.getContentPane().add(arma);
          arma.setText(fabrica.getArma().getDescripcion());
         
        ventana1.getContentPane().setLayout(new GridLayout(2, 1));
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
    }//GEN-LAST:event_botonCentauroActionPerformed
    

   
    /*public void ponerTexto(FabricaAbstracta fabrica){
        JFrame ventana1= new JFrame();
          JLabel centauro = new JLabel();
          JLabel arma= new JLabel();
          ventana1.setSize(300, 200);
          ventana1.getContentPane().add(centauro);
      ventana1.getContentPane().add(arma);
          arma.setText(fabrica.getArma().getTamaño());
        ventana1.getContentPane().setLayout(new GridLayout(2, 1));
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }*/
    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formComponentAdded

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCentauro;
    // End of variables declaration//GEN-END:variables
}
