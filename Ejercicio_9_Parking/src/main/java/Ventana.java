
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import jdk.jfr.Unsigned;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author arube
 */
public class Ventana extends javax.swing.JFrame {

    static ArrayList<Coche> listaCochesIn = new ArrayList<>();
    static ArrayList<Coche> registroCoches = new ArrayList<>();
    static Random rand = new Random();;
    static char letrasValidas[] = {'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    static String listaNombres[] = {"Alberto", "Mía", "David", "Torralvo", "Achraf", "Renzo", "Adrián", "Yiawei", "Víctor", "Curto"};
    static String listaApellidos[] = {"Rodríguez", "Pérez", "Moreta", "Carro", "López", "Hernández", "Martín", "Xia", "Celador", "Nieves"};
    static float precioPorSegundo = 0.03f;
    
    static DialogInfo ventanaInfo = new DialogInfo(null, false);
    static DialogListas ventanaCochesIn = new DialogListas(null, false, listaCochesIn);
    static DialogListas ventanaRegistro = new DialogListas(null, false, registroCoches);
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        File ruta = new File("datosParking.bin");
        
        if(ruta.exists()){
            try {

                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ruta));
                listaCochesIn = (ArrayList<Coche>) inputStream.readObject();
                registroCoches = (ArrayList<Coche>) inputStream.readObject();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton5 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelCocheSale = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelNombreSale = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelTiempoEstado = new javax.swing.JLabel();
        labelPrecioEstancia = new javax.swing.JLabel();
        tbEntrada = new javax.swing.JToggleButton();
        tbSalida = new javax.swing.JToggleButton();
        tbVerCoches = new javax.swing.JToggleButton();
        tbVerRegistro = new javax.swing.JToggleButton();
        tbVerInfo = new javax.swing.JToggleButton();
        tbCambiaColor = new javax.swing.JToggleButton();
        bSalir = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCocheEntra = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelNombreEntra = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelNumeroEntra = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelCont = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();

        jToggleButton5.setText("Ver coches totales");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking's Alberto");
        setBackground(new java.awt.Color(102, 0, 102));

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SALIDA");

        labelCocheSale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCocheSale.setForeground(new java.awt.Color(0, 0, 0));
        labelCocheSale.setText("...");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Está saliendo: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre asociado:");

        labelNombreSale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNombreSale.setForeground(new java.awt.Color(0, 0, 0));
        labelNombreSale.setText("...");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tiempo transcurrido: ");

        labelTiempoEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTiempoEstado.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempoEstado.setText("...");

        labelPrecioEstancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPrecioEstancia.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecioEstancia.setText("...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(labelPrecioEstancia))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNombreSale))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(labelTiempoEstado))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(32, 32, 32)
                                .addComponent(labelCocheSale))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labelCocheSale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(labelNombreSale))
                .addGap(148, 148, 148)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(labelTiempoEstado))
                .addGap(43, 43, 43)
                .addComponent(labelPrecioEstancia)
                .addGap(30, 30, 30))
        );

        tbEntrada.setText("Entrada Activa");
        tbEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEntradaActionPerformed(evt);
            }
        });

        tbSalida.setText("Salida Activa");
        tbSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSalidaActionPerformed(evt);
            }
        });

        tbVerCoches.setText("Ver coches dentro");
        tbVerCoches.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbVerCochesStateChanged(evt);
            }
        });
        tbVerCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbVerCochesActionPerformed(evt);
            }
        });

        tbVerRegistro.setText("Ver coches totales");
        tbVerRegistro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbVerRegistroStateChanged(evt);
            }
        });
        tbVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbVerRegistroActionPerformed(evt);
            }
        });

        tbVerInfo.setText("Ver información");
        tbVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbVerInfoActionPerformed(evt);
            }
        });

        tbCambiaColor.setText("Cambiar colores");
        tbCambiaColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCambiaColorActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ENTRADA");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Está entrando: ");

        labelCocheEntra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCocheEntra.setForeground(new java.awt.Color(0, 0, 0));
        labelCocheEntra.setText("...");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre asociado:");

        labelNombreEntra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNombreEntra.setForeground(new java.awt.Color(0, 0, 0));
        labelNombreEntra.setText("...");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Numero de veces que ha entrado:");

        labelNumeroEntra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNumeroEntra.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroEntra.setText("...");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNombreEntra))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(labelCocheEntra))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(labelNumeroEntra))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel5)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelCocheEntra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelNombreEntra))
                .addGap(153, 153, 153)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelNumeroEntra))
                .addGap(100, 100, 100))
        );

        jLabel7.setIcon(new ImageIcon("parkinC.png"));

        labelCont.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCont.setForeground(new java.awt.Color(255, 255, 255));
        labelCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCont.setText(" ");
        labelCont.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText(" ");
        labelHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCont, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tbEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbVerCoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbVerRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbVerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbCambiaColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCont, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbVerCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void tbCambiaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCambiaColorActionPerformed
        Color color = JColorChooser.showDialog(this, "Elige el color de los paneles de información", Color.yellow);
        
        jPanel4.setBackground(color);
        jPanel5.setBackground(color);
        
        color = JColorChooser.showDialog(this, "Elige el color del panel contenedor de fondo", Color.yellow);
        
        jPanel3.setBackground(color);
        
        tbCambiaColor.setSelected(false);
    }//GEN-LAST:event_tbCambiaColorActionPerformed

    private void tbVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbVerInfoActionPerformed
        ventanaInfo.estableceTextField(precioPorSegundo);
        if(((JToggleButton)evt.getSource()).isSelected())
            ventanaInfo.setVisible(true);
        else
            ventanaInfo.setVisible(false);
    }//GEN-LAST:event_tbVerInfoActionPerformed

    private void tbVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbVerRegistroActionPerformed
        ventanaRegistro.actualizaLista(registroCoches);
        
        if(((JToggleButton)evt.getSource()).isSelected())
            ventanaRegistro.setVisible(true);
        else
            ventanaRegistro.setVisible(false);
    }//GEN-LAST:event_tbVerRegistroActionPerformed

    private void tbVerCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbVerCochesActionPerformed
        ventanaCochesIn.actualizaLista(listaCochesIn);
        
        if(((JToggleButton)evt.getSource()).isSelected())
            ventanaCochesIn.setVisible(true);
        else
            ventanaCochesIn.setVisible(false);
    }//GEN-LAST:event_tbVerCochesActionPerformed

    private void tbSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSalidaActionPerformed

    private void tbEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEntradaActionPerformed

    private void tbVerCochesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbVerCochesStateChanged

    }//GEN-LAST:event_tbVerCochesStateChanged

    private void tbVerRegistroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbVerRegistroStateChanged

    }//GEN-LAST:event_tbVerRegistroStateChanged

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        File fichero = new File("datosParking.bin");

        try{

            fichero.delete();
            fichero.createNewFile();

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fichero));

            outputStream.writeObject(listaCochesIn);
            outputStream.writeObject(registroCoches);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);
        
    }//GEN-LAST:event_bSalirActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new Ventana().setVisible(true);                
        LocalTime hora;
        
        hora = LocalTime.now();
        labelCont.setText(""+listaCochesIn.size());
        labelHora.setText(""+hora.getHour()+":"+hora.getMinute());
        
        while(true){
            if(rand.nextBoolean() && !tbEntrada.isSelected())
                cocheEntrando();
            else if (!tbSalida.isSelected())
                cocheSaliendo();
            
            hora = LocalTime.now();
            labelCont.setText(""+listaCochesIn.size());
            labelHora.setText(""+hora.getHour()+":"+hora.getMinute());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bSalir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton5;
    private static javax.swing.JLabel labelCocheEntra;
    private static javax.swing.JLabel labelCocheSale;
    private static javax.swing.JLabel labelCont;
    private static javax.swing.JLabel labelHora;
    private static javax.swing.JLabel labelNombreEntra;
    private static javax.swing.JLabel labelNombreSale;
    private static javax.swing.JLabel labelNumeroEntra;
    private static javax.swing.JLabel labelPrecioEstancia;
    private static javax.swing.JLabel labelTiempoEstado;
    private javax.swing.JToggleButton tbCambiaColor;
    private static javax.swing.JToggleButton tbEntrada;
    private static javax.swing.JToggleButton tbSalida;
    private javax.swing.JToggleButton tbVerCoches;
    private javax.swing.JToggleButton tbVerInfo;
    private javax.swing.JToggleButton tbVerRegistro;
    // End of variables declaration//GEN-END:variables

    public static void cocheEntrando(){
        //Al 33% coche ya registrado al 66% coche nuevo
        Coche nuevoCoche = new Coche();
        boolean valido = true;
        
        if(rand.nextInt(0, 3) == 0 && !registroCoches.isEmpty()){
            int cont = 0;
            do{
                valido = true;
                
                nuevoCoche = registroCoches.get(rand.nextInt(registroCoches.size()));
                nuevoCoche.setHoraEntrada(Date.from(Instant.now()));
                nuevoCoche.setnEntradas(nuevoCoche.getnEntradas()+1);
                
                for(Coche c: listaCochesIn)
                    if(c.getMatricula().equals(nuevoCoche.getMatricula())){
                        return;
                    }
                
                if(cont++ == 200)
                    break;
                
            }while(!valido);
        
        }else {
        
            nuevoCoche.setMatricula(generaMatricula());
            nuevoCoche.setHoraEntrada(Date.from(Instant.now()));
            nuevoCoche.setnEntradas(1);
            nuevoCoche.setNombreConductor(listaNombres[rand.nextInt(listaNombres.length)] + " " + 
                                          listaApellidos[rand.nextInt(listaApellidos.length)]);
            
            registroCoches.add(nuevoCoche);
        }
        
        if(valido){
            
            labelCocheEntra.setText(nuevoCoche.getMatricula());
            labelNombreEntra.setText(nuevoCoche.getNombreConductor());
            labelNumeroEntra.setText(""+nuevoCoche.getnEntradas());
            
            listaCochesIn.add(nuevoCoche);
            
            labelCont.setText(""+listaCochesIn.size());
        }
        
        ventanaRegistro.actualizaLista(registroCoches);
        ventanaCochesIn.actualizaLista(listaCochesIn);
        
        try {
        
            Thread.sleep(rand.nextInt(1000, 10000));
        
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String generaMatricula(){
        String resultado = "";
        
        for(int i = 0; i < 4; i++){
            resultado += rand.nextInt(0, 10);
        }
        
        resultado += " - ";
        
        for(int i = 0; i < 3; i++){
            resultado += letrasValidas[rand.nextInt(0, letrasValidas.length)];
        }
        
        for(Coche c : listaCochesIn)
            if(c.getMatricula().equals(resultado)){
                generaMatricula();
                break;
            }
        
        for(Coche c : registroCoches)
            if(c.getMatricula().equals(resultado)){
                generaMatricula();
                break;
            }
        
        return resultado;
    }
    
    public static void cocheSaliendo(){
        if(!listaCochesIn.isEmpty()){
            Coche cocheSale = listaCochesIn.remove(rand.nextInt(listaCochesIn.size()));
            labelCont.setText(""+listaCochesIn.size());
            
            long tiempoEnSegundos = (Date.from(Instant.now()).getTime() - cocheSale.getHoraEntrada().getTime()) / 1000;
            cocheSale.setHoraEntrada(null);

            float precioEstancia = (tiempoEnSegundos * precioPorSegundo)/100;
            
            labelCocheSale.setText(cocheSale.getMatricula());
            labelNombreSale.setText(cocheSale.getNombreConductor());
            labelPrecioEstancia.setText(""+precioEstancia+"€");
            
            labelTiempoEstado.setText(String.format("%.2f'", (float) tiempoEnSegundos / 60));
            
            ventanaRegistro.actualizaLista(registroCoches);
            ventanaCochesIn.actualizaLista(listaCochesIn);
            
            try {
            
            Thread.sleep(rand.nextInt(1000, 10000));
        
            } catch (InterruptedException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}