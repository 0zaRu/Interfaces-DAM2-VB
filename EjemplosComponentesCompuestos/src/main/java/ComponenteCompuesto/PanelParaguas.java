/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ComponenteCompuesto;

import javax.swing.ImageIcon;

/**
 *
 * @author arube
 */
public class PanelParaguas extends javax.swing.JPanel {

    boolean estadoParaguas = false;
    /**
     * Creates new form PanelColor
     */
    public PanelParaguas() {
        initComponents();
        jLabel1.setText("Que buen día hace");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setIcon(new ImageIcon("paraguascerrado.png"));
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void cambiaParaguas(boolean llueve){
        if(estadoParaguas)
            estadoParaguas = false;
        else
            estadoParaguas = true;
        
        
        if(estadoParaguas && llueve){
            jLabel1.setText("Estoy proteguido");
            jLabel1.setIcon(new ImageIcon("paraguasabierto.png"));
        
        }else if(estadoParaguas && !llueve){
            jLabel1.setText("Soy tonto");
            jLabel1.setIcon(new ImageIcon("paraguasabierto.png"));
        
        }else if(!estadoParaguas && !llueve){
            jLabel1.setText("Que buen día hace");
            jLabel1.setIcon(new ImageIcon("paraguascerrado.png"));
            
        }else if(!estadoParaguas && llueve){
            jLabel1.setText("Me mojo");
            jLabel1.setIcon(new ImageIcon("paraguascerrado.png"));
        }
    }
}
